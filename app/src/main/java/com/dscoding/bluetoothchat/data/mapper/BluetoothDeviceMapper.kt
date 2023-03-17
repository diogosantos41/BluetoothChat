package com.dscoding.bluetoothchat.data.mapper

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.dscoding.bluetoothchat.domain.model.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}