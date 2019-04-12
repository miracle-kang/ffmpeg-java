package com.code4thought.ffmpeg;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Specified here
 *
 * @author kangliqi
 * @date 2019/4/12
 */
public class FFmpegBuilder {

    private Demuxer demuxer;
    private Decoder decoder;
    private Filter filter;
    private Encoder encoder;
    private Muxer muxer;


    public FFmpegBuilder() {
    }

    public FFmpegBuilder input(File file) {

        return this;
    }

    public FFmpegBuilder input(String url) {

        return this;
    }

    public FFmpegBuilder input(InputStream stream) {

        return this;
    }

    public FFmpegBuilder output(File file) {

        return this;
    }

    public FFmpegBuilder output(String url) {

        return this;
    }

    public FFmpegBuilder output(OutputStream stream) {

        return this;
    }

    public FFmpeg build() {
        return new FFmpeg();
    }
}
