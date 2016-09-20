'use strict';

angular.module('sejourApp')
    .controller('PaymentController', function ($rootScope, $scope, $state, $location, $timeout, Auth) {
    	$scope.user = {};
		$scope.errors = {};
		
		$scope.isConfirmation = 'false';
		
    	$scope.autocomplete = function() {
    		if($scope.payment.cardOwner === 'Kim') {
    			$scope.payment.cardNumber = '4970 1012 3456 7890';
    			$scope.payment.cardExpiringDate = '08 / 19';
    			$scope.payment.cardCV = '123';
    		} else if($scope.payment.cardOwner === 'Zayat') {
    			$scope.payment.cardNumber = '4970 1012 3456 7890';
    			$scope.payment.cardExpiringDate = '08 / 19';
    			$scope.payment.cardCV = '123';
    		}
        };
        
//        $scope.selectPayment = function () {
//        	isPaymentVisa = true;
//        }
        
        $scope.back = function () {
        	$state.go('address');
        };
        
        $scope.save = function () {
        	$state.go('paymentConfirmation');
        };
        
    });
