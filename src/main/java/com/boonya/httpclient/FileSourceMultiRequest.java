package com.boonya.httpclient;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: FileSourceMultiRequest
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-07-19
 */
public class FileSourceMultiRequest implements Serializable
{

    /// <summary>
    /// SIM卡号【必填】
    /// </summary>
    public String[] Sims ;

    /// <summary>
    /// 通道号(Channel小于0通道不生效)
    /// </summary>
    public int Channel ;

    /// <summary>
    /// 报警标志(最小值为0，不能为负数)
    /// </summary>
    public long[] Alarms ;

    /// <summary>
    /// 存储器类型(0:主存储器或灾备存储器，1:主存储器，2:灾备存储器)【必填】
    /// </summary>
    public int StorageType ;

    /// <summary>
    /// 码流类型(0:主码流或子码流，1:主码流，2:子码流)【必填】
    /// </summary>
    public int StreamType ;

    /// <summary>
    /// 开始时间(yyyy-MM-dd HH:mm:ss)【必填】
    /// </summary>
    public Date StartTime ;

    /// <summary>
    /// 结束时间(yyyy-MM-dd HH:mm:ss)【必填】
    /// </summary>
    public Date EndTime ;

    /// <summary>
    /// 音视频资源类型(0:音视频，1:音频，2:视频，3:视频或音频)
    /// </summary>
    public int DataType;

    public String[] getSims() {
        return Sims;
    }

    public void setSims(String[] sims) {
        Sims = sims;
    }

    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        Channel = channel;
    }

    public long[] getAlarms() {
        return Alarms;
    }

    public void setAlarms(long[] alarms) {
        Alarms = alarms;
    }

    public int getStorageType() {
        return StorageType;
    }

    public void setStorageType(int storageType) {
        StorageType = storageType;
    }

    public int getStreamType() {
        return StreamType;
    }

    public void setStreamType(int streamType) {
        StreamType = streamType;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public int getDataType() {
        return DataType;
    }

    public void setDataType(int dataType) {
        DataType = dataType;
    }
}
