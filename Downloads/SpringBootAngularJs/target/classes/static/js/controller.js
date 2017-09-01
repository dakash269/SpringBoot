 angular.module('app1')
     .controller('controller',['$scope','DATUM','$window','$route', function($scope, DATUM,$window,$route) {
         $scope.updateData = function (id,doing,to_do,done,event) {
             var data={id:id,doing:doing,to_do:to_do,done:done};
          // DATUM.updateData(data,function (response) {
          //     $scope.getData();
          // });
         };
         $scope.movetoTo_do = function (id,content) {
            var data={id:id,content:content,doing:0,to_do:1,done:0};
             DATUM.postData(data,function(response){
                 $scope.getData();
             });
         };
         $scope.movetoDoing = function (id,content) {
             var data={id:id,content:content,doing:1,to_do:0,done:0};
             DATUM.postData(data,function(response){
                 $scope.getData();
             });
         };
         $scope.movetoDone = function (id,content) {
             var data={id:id,content:content,doing:0,to_do:0,done:1};
             DATUM.postData(data,function(response){
                 $scope.getData();
             });
         };

         $scope.getData = function () {
                DATUM.getDoing(function (response) {
                    $scope.posts1=response;
                    $scope.models1 = {
                        selected: null,
                        lists: {"posts1": $scope.posts1}
                    };
                });
                DATUM.getTo_do(function (response) {
                 $scope.posts2=response;
                 $scope.models2 = {
                     selected: null,
                     lists: {"posts2": $scope.posts2}
                 };
               });
             DATUM.getDone(function (response) {
                 $scope.posts3=response;
                 $scope.models3 = {
                     selected: null,
                     lists: {"posts3": $scope.posts3}
                 };
             });
             DATUM.getBacklog(function (response) {
                 $scope.posts4=response;
                 $scope.models4 = {
                     selected: null,
                     lists: {"posts4": $scope.posts4}
                 };
             });
            };
         $scope.getData();
         $scope.sendDatato1 = function () {
                var data = {title:$scope.title,content:$scope.content1,doing:1,to_do:0,done:0};
                DATUM.postData(data,function(response){
                    delete data;
                    $scope.getData();
                });
            };
         $scope.sendDatato2 = function () {
             var data = {title:$scope.title,content:$scope.content2,doing:0,to_do:1,done:0};
             DATUM.postData(data,function(response){
                 delete data;
                 $scope.getData();
             });
         };
         $scope.sendDatato3 = function () {
             var data = {title:$scope.title,content:$scope.content3,doing:0,to_do:0,done:1};
             DATUM.postData(data,function(response){
                 delete data;
                 $scope.getData();
             });
         };
         $scope.sendDatato4 = function () {
             var data = {title:$scope.title,content:$scope.content4,doing:0,to_do:0,done:0};
             DATUM.postData(data,function(response){
                 delete data;
                 $scope.getData();
             });
         };
         $scope.deleteData = function (id) {
           var data={id:id};
           DATUM.deleteData(data,function (response) {
               $scope.getData();
           });
         };
     }])
     .factory('DATUM',['$resource', function($resource){
         return $resource('',{data:'@data'},{
             getDoing:{
                 url:"/getDoing" ,
                 method:'GET',
                 isArray : true
             },
             getTo_do:{
                 url:"/getTo_do" ,
                 method:'GET',
                 isArray : true
             },
             getDone:{
                 url:"/getDone" ,
                 method:'GET',
                 isArray : true
             },
             getBacklog:{
                 url:"/getBacklog" ,
                 method:'GET',
                 isArray : true
             },
             deleteData:{
                 url:"/deleteData" ,
                 method:'POST',
                 isArray : true
             },
             postData:{
                 url:"/addData" ,
                 method:'POST',
                 isArray : true
             },
             updateData:{
                 url:"/updateData" ,
                 method:'POST',
                 isArray : true
             }
         });
     }])
 ;
