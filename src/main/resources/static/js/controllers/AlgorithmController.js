App.controller('AlgorithmController', function($scope, $http) {
	
    $scope.algorithm = {};
    $scope.editMode = false;

    $scope.listData = function() {

        $http.post('algorithm/list').success(function() {
           
        }).error(function() {
            $scope.setError('Could not add a new user');
        });
    };
});
