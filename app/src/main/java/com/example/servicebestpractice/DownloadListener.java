package com.example.servicebestpractice;

/**
 * Created by wanhongxu on 2017/5/16.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
