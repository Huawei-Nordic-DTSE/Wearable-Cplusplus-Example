#include <jni.h>
#include <Hilog/log.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_harmony_alliance_jnidemo_JNITools_addNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a+b;
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_harmony_alliance_jnidemo_JNITools_subNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a-b;
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_harmony_alliance_jnidemo_JNITools_mulNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a*b;
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_harmony_alliance_jnidemo_JNITools_divNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a/b;
}