App.controller('UserController', function($scope, $http, $rootScope) {

    /**
     * User
     */
	$scope.user={};
	$scope.user.name="";
	$scope.user.id="";
	$scope.user.topics=[];
	$scope.users=[];

    function User(user) {
        this.name = user.name;
        this.id = user.id;
        this.topics = user.topics;
    }


    /**
     * AJAX
     */
    $scope.fetchUsersList = function() {
        $http.get('users/userlist.json').success(function(userList){
            var updatedUserlist = [];

            angular.forEach(userList, function(user){
                var newUser = new User(user);
                updatedUserlist.push(newUser);
            });

            $scope.users = updatedUserlist
        });
    };

    $scope.addNewUser = function(user) {
        $http.post('users/add/', user).success(function() {
            $scope.fetchUsersList();
        });
        $scope.user = '';
    };


    $scope.loginUser = function (user){
        $http.post('users/login/' + user.id).success(function(){
            $rootScope.loggedInUser = user;
        });
    };

    $scope.getLoggedInUser = function(){
        $http.get('users/loggedIn/get').success(function(loggedInUser){
            $rootScope.loggedInUser = loggedInUser;
        });
    };

    $scope.removeUser = function(id) {
        $http.delete('users/remove/' + id).success(function() {
            $scope.fetchUsersList();
        });
    };

    $scope.removeAllUsers = function() {
        $http.delete('users/removeAll').success(function() {
            $scope.fetchUsersList();
        });

    };

    $scope.fetchUsersList();
    $scope.getLoggedInUser();
});
