
App.controller('publisherController', function ($rootScope, $http, $location, $scope) {
	
	$scope.topic = {};
	
	function Topic(){
		this.name; 
		this.description;
		this.id; 
		this.userId;
	}
	
	$scope.saveTopic = function(topic){
		
		$http.post('topic/add/', topic).success(function() {
			alert("up to here");
			$rootScope.fetchTopics();
			$location.path("/start");
	    	});		 
	    	$scope.topic = {};
	};
	
	
});