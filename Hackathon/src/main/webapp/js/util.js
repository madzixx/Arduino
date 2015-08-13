angular.module('App', [])
        .controller('Controller', function ($scope, $http) {

            var urlAcender = '/led/acender', urlApagar = 'localhost:8081/led/apagar';

            $scope.EnviaComando = function (porta) {
                $http({method: 'POST', url: urlAcender, headers: {'Content-Type': 'application/json'}, data: porta})
                        .success(function (data, status, headers, config) {
                        }).
                        error(function (data, status, headers, config) {
                        });
            }
        })