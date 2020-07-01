LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := hello// 生成的so文件名称
LOCAL_SRC_FILES := hello.c//编译的c或c++文件
include $(BUILD_SHARED_LIBRARY)
