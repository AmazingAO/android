package com.example.servicebestpractice;

public interface DownloadListener {
    void onProgress(int progress);//通知下载进度
    void onSuccess();//通知下载成功
    void onFailed();//通知下载失败
    void onPaused();//通知下载暂停
    void Canceled();//通知下载取消
}
