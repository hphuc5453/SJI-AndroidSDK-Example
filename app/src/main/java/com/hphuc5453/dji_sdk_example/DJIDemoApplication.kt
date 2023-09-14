//package com.hphuc5453.dji_sdk_example
//
//import dji.sdk.base.BaseProduct
//import dji.sdk.camera.Camera
//import dji.sdk.flightcontroller.FlightController
//import dji.sdk.products.Aircraft
//import dji.sdk.products.HandHeld
//import dji.sdk.sdkmanager.DJISDKManager
//
//object DJIDemoApplication {
//
//    fun getProductInstance(): BaseProduct? {
//        return DJISDKManager.getInstance().product
//    }
//
//    fun getCameraInstance(): Camera? {
//        if (getProductInstance() == null) return null
//
//        return if (getProductInstance() is Aircraft) {
//            (getProductInstance() as Aircraft).camera
//        } else if (getProductInstance() is HandHeld) {
//            (getProductInstance() as HandHeld).camera
//        } else
//            null
//    }
//
//    fun getFlightController(): FlightController? {
//        // returns flight controller, this is what you will use
//        // to tell the drone how to move
//        val product = getProductInstance()?: return null
//        if (product.isConnected) {
//            if (product is Aircraft) {
//                return product.flightController
//            }
//        }
//        return null
//    }
//
//    fun isAircraftConnected(): Boolean {
//        return getProductInstance() != null && getProductInstance() is Aircraft
//    }
//
//    fun isProductModuleAvailable(): Boolean {
//        return (getProductInstance() != null)
//    }
//
//    fun isCameraModuleAvailable(): Boolean {
//        return isProductModuleAvailable() && (getProductInstance()?.camera != null)
//    }
//
//    fun isPlaybackAvailable(): Boolean {
//        return isCameraModuleAvailable() && (getProductInstance()?.camera?.playbackManager != null)
//    }
//
//}