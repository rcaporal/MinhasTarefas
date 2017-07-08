'use strict';

angular.module('todoListApp')
.service('dataService', function($http) {

  var todosGrailsServerUri = 'http://localhost:9090/todos';

  this.getTodos = function(callback){
  	$http.get(todosGrailsServerUri).then(callback)
  };

  this.addTodo = function(callback) {
      var todo = {name: "Nova tarefa.", completed: false};
      $http.post(todosGrailsServerUri,todo).then(callback);
  }

  this.deleteTodo = function(todo, callback) {
      $http.delete(todosGrailsServerUri + '/' + todo.id).then(callback);
  };

  this.saveTodo = function(todo, callback) {
      $http.put(todosGrailsServerUri + '/' + todo.id,todo).then(callback);
  };
});
