package com.dscoding.bluetoothchat.domain

import java.io.IOException

class TransferFailedException: IOException("Reading incoming data failed")