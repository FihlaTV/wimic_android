package bo.htakey.wimic.service;

import java.util.List;

import bo.htakey.rimic.IRimicService;

/**
 * Created by andrew on 28/02/17.
 */
public interface IWimicService extends IRimicService {
    void setOverlayShown(boolean showOverlay);

    boolean isOverlayShown();

    void clearChatNotifications();

    void markErrorShown();

    boolean isErrorShown();

    void onTalkKeyDown();

    void onTalkKeyUp();

    List<IChatMessage> getMessageLog();

    void clearMessageLog();

    void setSuppressNotifications(boolean suppressNotifications);
}
