//
// Created by Administrator on 2020/6/30.
//
#include<jni.h>
#include<stdio.h>
//导入我们创建的头文件
#include "myh_com_jnimodel_HelloWord.h"
JNIEXPORT jstring JNICALL Java_myh_com_jnimodel_HelloWord_getString
  (JNIEnv *env, jclass jclass){
      //返回一个字符串
      return (*env)->NewStringUTF(env,"This is my first NDK Application");
  }

  JNIEXPORT jint JNICALL Java_myh_com_jnimodel_HelloWord_add
    (JNIEnv *env,jclass jclass, jint a, jint b){
        return a+b;
    }

