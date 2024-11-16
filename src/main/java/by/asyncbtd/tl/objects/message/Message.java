/*
 * Copyright 2024 asyncbtd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package by.asyncbtd.tl.objects.message;

import by.asyncbtd.tl.objects.*;
import by.asyncbtd.tl.objects.background.ChatBackground;
import by.asyncbtd.tl.objects.chat.Chat;
import by.asyncbtd.tl.objects.chat.boost.ChatBoostAdded;
import by.asyncbtd.tl.objects.chat.ChatShared;
import by.asyncbtd.tl.objects.forum.*;
import by.asyncbtd.tl.objects.game.*;
import by.asyncbtd.tl.objects.keyboard.InlineKeyboardMarkup;
import by.asyncbtd.tl.objects.paid.PaidMediaInfo;
import by.asyncbtd.tl.objects.video.*;
import by.asyncbtd.tl.objects.web.WebAppData;

import java.util.List;

public class Message implements MaybeInaccessibleMessage {

    private Integer messageId;
    private Integer messageThreadId;
    private User from;
    private Chat senderChat;
    private Integer senderBoostCount;
    private User senderBusinessBot;
    private Integer date;
    private String businessConnectionId;
    private Chat chat;
    private MessageOrigin forwardOrigin;
    private Boolean isTopicMessage;
    private Boolean isAutomaticForward;
    private Message replyToMessage;
    private ExternalReplyInfo externalReply;
    private TextQuote quote;
    private Story replyToStory;
    private User viaBot;
    private Integer editData;
    private Boolean hasProtectedContent;
    private Boolean isFromOffline;
    private String mediaGroupId;
    private String authorSignature;
    private String text;
    private List<MessageEntity> entities;
    private LinkPreviewOptions linkPreviewOptions;
    private String effectId;
    private Animation animation;
    private Audio audio;
    private Document document;
    private PaidMediaInfo paidMedia;
    private List<PhotoSize> photo;
    private Sticker sticker;
    private Story story;
    private Video video;
    private VideoNote videoNote;
    private Voice voice;
    private String caption;
    private List<MessageEntity> captionEntities;
    private Boolean showCaptionAboveMedia;
    private Boolean hasMediaSpoiler;
    private Contact contact;
    private Dice dice;
    private Game game;
    private Poll poll;
    private Venue venue;
    private Location location;
    private List<User> newChatMembers;
    private User leftChatMember;
    private String newChatTitle;
    private List<PhotoSize> newChatPhoto;
    private Boolean deleteChatPhoto;
    private Boolean groupChatCreated;
    private Boolean supergroupChatCreated;
    private Boolean channelChatCreated;
    private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
    private Long migrateToChatId;
    private Long migrateFromChatId;
    private MaybeInaccessibleMessage pinnedMessage;
    private Invoice invoice;
    private SuccessfulPayment successfulPayment;
    private RefundedPayment refundedPayment;
    private UsersShared usersShared;
    private ChatShared chatShared;
    private String connectedWebsite;
    private WriteAccessAllowed writeAccessAllowed;
    private PassportData passportData;
    private ProximityAlertTriggered proximityAlertTriggered;
    private ChatBoostAdded chatBoostAdded;
    private ChatBackground chatBackground;
    private ForumTopicCreated forumTopicCreated;
    private ForumTopicEdited forumTopicEdited;
    private ForumTopicClosed forumTopicClosed;
    private ForumTopicReopened forumTopicReopened;
    private GeneralForumTopicHidden generalForumTopicHidden;
    private GeneralForumTopicUnhidden generalForumTopicUnhidden;
    private GiveawayCreated giveawayCreated;
    private Giveaway giveaway;
    private GiveawayWinners giveawayWinners;
    private GiveawayCompleted giveawayCompleted;
    private VideoChatScheduled videoChatScheduled;
    private VideoChatStarted videoChatStarted;
    private VideoChatEnded videoChatEnded;
    private VideoChatParticipantsInvited videoChatParticipantsInvited;
    private WebAppData webAppData;
    private InlineKeyboardMarkup replyMarkup;

    public Long getChatId() {
        return this.chat.getId();
    }

    public Integer getMessageId() {
        return this.messageId;
    }

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public User getFrom() {
        return from;
    }

    public Chat getSenderChat() {
        return senderChat;
    }

    public Integer getSenderBoostCount() {
        return senderBoostCount;
    }

    public User getSenderBusinessBot() {
        return senderBusinessBot;
    }

    public Integer getDate() {
        return date;
    }

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public Chat getChat() {
        return chat;
    }

    public MessageOrigin getForwardOrigin() {
        return forwardOrigin;
    }

    public Boolean getIsTopicMessage() {
        return isTopicMessage;
    }

    public Boolean getIsAutomaticForward() {
        return isAutomaticForward;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public ExternalReplyInfo getExternalReply() {
        return externalReply;
    }

    public TextQuote getQuote() {
        return quote;
    }

    public Story getReplyToStory() {
        return replyToStory;
    }

    public User getViaBot() {
        return viaBot;
    }

    public Integer getEditData() {
        return editData;
    }

    public Boolean getHasProtectedContent() {
        return hasProtectedContent;
    }

    public Boolean getIsFromOffline() {
        return isFromOffline;
    }

    public String getMediaGroupId() {
        return mediaGroupId;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public String getText() {
        return text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public LinkPreviewOptions getLinkPreviewOptions() {
        return linkPreviewOptions;
    }

    public String getEffectId() {
        return effectId;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public PaidMediaInfo getPaidMedia() {
        return paidMedia;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Story getStory() {
        return story;
    }

    public Video getVideo() {
        return video;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public Voice getVoice() {
        return voice;
    }

    public String getCaption() {
        return caption;
    }

    public List<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    public Boolean getShowCaptionAboveMedia() {
        return showCaptionAboveMedia;
    }

    public Boolean getHasMediaSpoiler() {
        return hasMediaSpoiler;
    }

    public Contact getContact() {
        return contact;
    }

    public Dice getDice() {
        return dice;
    }

    public Game getGame() {
        return game;
    }

    public Poll getPoll() {
        return poll;
    }

    public Venue getVenue() {
        return venue;
    }

    public Location getLocation() {
        return location;
    }

    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    public MessageAutoDeleteTimerChanged getMessageAutoDeleteTimerChanged() {
        return messageAutoDeleteTimerChanged;
    }

    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public MaybeInaccessibleMessage getPinnedMessage() {
        return pinnedMessage;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    public RefundedPayment getRefundedPayment() {
        return refundedPayment;
    }

    public UsersShared getUsersShared() {
        return usersShared;
    }

    public ChatShared getChatShared() {
        return chatShared;
    }

    public String getConnectedWebsite() {
        return connectedWebsite;
    }

    public WriteAccessAllowed getWriteAccessAllowed() {
        return writeAccessAllowed;
    }

    public PassportData getPassportData() {
        return passportData;
    }

    public ProximityAlertTriggered getProximityAlertTriggered() {
        return proximityAlertTriggered;
    }

    public ChatBoostAdded getChatBoostAdded() {
        return chatBoostAdded;
    }

    public ChatBackground getChatBackground() {
        return chatBackground;
    }

    public ForumTopicCreated getForumTopicCreated() {
        return forumTopicCreated;
    }

    public ForumTopicEdited getForumTopicEdited() {
        return forumTopicEdited;
    }

    public ForumTopicClosed getForumTopicClosed() {
        return forumTopicClosed;
    }

    public ForumTopicReopened getForumTopicReopened() {
        return forumTopicReopened;
    }

    public GeneralForumTopicHidden getGeneralForumTopicHidden() {
        return generalForumTopicHidden;
    }

    public GeneralForumTopicUnhidden getGeneralForumTopicUnhidden() {
        return generalForumTopicUnhidden;
    }

    public GiveawayCreated getGiveawayCreated() {
        return giveawayCreated;
    }

    public Giveaway getGiveaway() {
        return giveaway;
    }

    public GiveawayWinners getGiveawayWinners() {
        return giveawayWinners;
    }

    public GiveawayCompleted getGiveawayCompleted() {
        return giveawayCompleted;
    }

    public VideoChatScheduled getVideoChatScheduled() {
        return videoChatScheduled;
    }

    public VideoChatStarted getVideoChatStarted() {
        return videoChatStarted;
    }

    public VideoChatEnded getVideoChatEnded() {
        return videoChatEnded;
    }

    public VideoChatParticipantsInvited getVideoChatParticipantsInvited() {
        return videoChatParticipantsInvited;
    }

    public WebAppData getWebAppData() {
        return webAppData;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setChatId(Long id) {
        this.chat.setId(id);
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setSenderChat(Chat senderChat) {
        this.senderChat = senderChat;
    }

    public void setSenderBoostCount(Integer senderBoostCount) {
        this.senderBoostCount = senderBoostCount;
    }

    public void setSenderBusinessBot(User senderBusinessBot) {
        this.senderBusinessBot = senderBusinessBot;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setBusinessConnectionId(String businessConnectionId) {
        this.businessConnectionId = businessConnectionId;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setForwardOrigin(MessageOrigin forwardOrigin) {
        this.forwardOrigin = forwardOrigin;
    }

    public void setIsTopicMessage(Boolean isTopicMessage) {
        this.isTopicMessage = isTopicMessage;
    }

    public void setIsAutomaticForward(Boolean isAutomaticForward) {
        this.isAutomaticForward = isAutomaticForward;
    }

    public void setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    public void setExternalReply(ExternalReplyInfo externalReply) {
        this.externalReply = externalReply;
    }

    public void setQuote(TextQuote quote) {
        this.quote = quote;
    }

    public void setReplyToStory(Story replyToStory) {
        this.replyToStory = replyToStory;
    }

    public void setViaBot(User viaBot) {
        this.viaBot = viaBot;
    }

    public void setEditData(Integer editData) {
        this.editData = editData;
    }

    public void setHasProtectedContent(Boolean hasProtectedContent) {
        this.hasProtectedContent = hasProtectedContent;
    }

    public void setIsFromOffline(Boolean isFromOffline) {
        this.isFromOffline = isFromOffline;
    }

    public void setMediaGroupId(String mediaGroupId) {
        this.mediaGroupId = mediaGroupId;
    }

    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public void setLinkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
        this.linkPreviewOptions = linkPreviewOptions;
    }

    public void setEffectId(String effectId) {
        this.effectId = effectId;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setPaidMedia(PaidMediaInfo paidMedia) {
        this.paidMedia = paidMedia;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setCaptionEntities(List<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;
    }

    public void setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
    }

    public void setHasMediaSpoiler(Boolean hasMediaSpoiler) {
        this.hasMediaSpoiler = hasMediaSpoiler;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
    }

    public void setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
    }

    public void setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
    }

    public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
    }

    public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
    }

    public void setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
    }

    public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
    }

    public void setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
    }

    public void setMessageAutoDeleteTimerChanged(MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged) {
        this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
    }

    public void setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    public void setMigrateFromChatId(Long migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
    }

    public void setPinnedMessage(MaybeInaccessibleMessage pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setSuccessfulPayment(SuccessfulPayment successfulPayment) {
        this.successfulPayment = successfulPayment;
    }

    public void setRefundedPayment(RefundedPayment refundedPayment) {
        this.refundedPayment = refundedPayment;
    }

    public void setUsersShared(UsersShared usersShared) {
        this.usersShared = usersShared;
    }

    public void setChatShared(ChatShared chatShared) {
        this.chatShared = chatShared;
    }

    public void setConnectedWebsite(String connectedWebsite) {
        this.connectedWebsite = connectedWebsite;
    }

    public void setWriteAccessAllowed(WriteAccessAllowed writeAccessAllowed) {
        this.writeAccessAllowed = writeAccessAllowed;
    }

    public void setPassportData(PassportData passportData) {
        this.passportData = passportData;
    }

    public void setProximityAlertTriggered(ProximityAlertTriggered proximityAlertTriggered) {
        this.proximityAlertTriggered = proximityAlertTriggered;
    }

    public void setChatBoostAdded(ChatBoostAdded chatBoostAdded) {
        this.chatBoostAdded = chatBoostAdded;
    }

    public void setChatBackground(ChatBackground chatBackground) {
        this.chatBackground = chatBackground;
    }

    public void setForumTopicCreated(ForumTopicCreated forumTopicCreated) {
        this.forumTopicCreated = forumTopicCreated;
    }

    public void setForumTopicEdited(ForumTopicEdited forumTopicEdited) {
        this.forumTopicEdited = forumTopicEdited;
    }

    public void setForumTopicClosed(ForumTopicClosed forumTopicClosed) {
        this.forumTopicClosed = forumTopicClosed;
    }

    public void setForumTopicReopened(ForumTopicReopened forumTopicReopened) {
        this.forumTopicReopened = forumTopicReopened;
    }

    public void setGeneralForumTopicHidden(GeneralForumTopicHidden generalForumTopicHidden) {
        this.generalForumTopicHidden = generalForumTopicHidden;
    }

    public void setGeneralForumTopicUnhidden(GeneralForumTopicUnhidden generalForumTopicUnhidden) {
        this.generalForumTopicUnhidden = generalForumTopicUnhidden;
    }

    public void setGiveawayCreated(GiveawayCreated giveawayCreated) {
        this.giveawayCreated = giveawayCreated;
    }

    public void setGiveaway(Giveaway giveaway) {
        this.giveaway = giveaway;
    }

    public void setGiveawayWinners(GiveawayWinners giveawayWinners) {
        this.giveawayWinners = giveawayWinners;
    }

    public void setGiveawayCompleted(GiveawayCompleted giveawayCompleted) {
        this.giveawayCompleted = giveawayCompleted;
    }

    public void setVideoChatScheduled(VideoChatScheduled videoChatScheduled) {
        this.videoChatScheduled = videoChatScheduled;
    }

    public void setVideoChatStarted(VideoChatStarted videoChatStarted) {
        this.videoChatStarted = videoChatStarted;
    }

    public void setVideoChatEnded(VideoChatEnded videoChatEnded) {
        this.videoChatEnded = videoChatEnded;
    }

    public void setVideoChatParticipantsInvited(VideoChatParticipantsInvited videoChatParticipantsInvited) {
        this.videoChatParticipantsInvited = videoChatParticipantsInvited;
    }

    public void setWebAppData(WebAppData webAppData) {
        this.webAppData = webAppData;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public String toString() {
        return "Message(messageId=" + this.getMessageId() +
                ", messageThreadId=" + this.getMessageThreadId() +
                ", from=" + this.getFrom() +
                ", senderChat=" + this.getSenderChat() +
                ", senderBoostCount=" + this.getSenderBoostCount() +
                ", senderBusinessBot=" + this.getSenderBusinessBot() +
                ", date=" + this.getDate() +
                ", businessConnectionId=" + this.getBusinessConnectionId() +
                ", chat=" + this.getChat() +
                ", forwardOrigin=" + this.getForwardOrigin() +
                ", isTopicMessage=" + this.getIsTopicMessage() +
                ", isAutomaticForward=" + this.getIsAutomaticForward() +
                ", replyToMessage=" + this.getReplyToMessage() +
                ", externalReply=" + this.getExternalReply() +
                ", quote=" + this.getQuote() +
                ", replyToStory=" + this.getReplyToStory() +
                ", viaBot=" + this.getViaBot() +
                ", editData=" + this.getEditData() +
                ", hasProtectedContent=" + this.getHasProtectedContent() +
                ", isFromOffline=" + this.getIsFromOffline() +
                ", mediaGroupId=" + this.getMediaGroupId() +
                ", authorSignature=" + this.getAuthorSignature() +
                ", text=" + this.getText() +
                ", entities=" + this.getEntities() +
                ", linkPreviewOptions=" + this.getLinkPreviewOptions() +
                ", effectId=" + this.getEffectId() +
                ", animation=" + this.getAnimation() +
                ", audio=" + this.getAudio() +
                ", document=" + this.getDocument() +
                ", paidMedia=" + this.getPaidMedia() +
                ", photo=" + this.getPhoto() +
                ", sticker=" + this.getSticker() +
                ", story=" + this.getStory() +
                ", video=" + this.getVideo() +
                ", videoNote=" + this.getVideoNote() +
                ", voice=" + this.getVoice() +
                ", caption=" + this.getCaption() +
                ", captionEntities=" + this.getCaptionEntities() +
                ", showCaptionAboveMedia=" + this.getShowCaptionAboveMedia() +
                ", hasMediaSpoiler=" + this.getHasMediaSpoiler() +
                ", contact=" + this.getContact() +
                ", dice=" + this.getDice() +
                ", game=" + this.getGame() +
                ", poll=" + this.getPoll() +
                ", venue=" + this.getVenue() +
                ", location=" + this.getLocation() +
                ", newChatMembers=" + this.getNewChatMembers() +
                ", leftChatMember=" + this.getLeftChatMember() +
                ", newChatTitle=" + this.getNewChatTitle() +
                ", newChatPhoto=" + this.getNewChatPhoto() +
                ", deleteChatPhoto=" + this.getDeleteChatPhoto() +
                ", groupChatCreated=" + this.getGroupChatCreated() +
                ", supergroupChatCreated=" + this.getSupergroupChatCreated() +
                ", channelChatCreated=" + this.getChannelChatCreated() +
                ", messageAutoDeleteTimerChanged=" + this.getMessageAutoDeleteTimerChanged() +
                ", migrateToChatId=" + this.getMigrateToChatId() +
                ", migrateFromChatId=" + this.getMigrateFromChatId() +
                ", pinnedMessage=" + this.getPinnedMessage() +
                ", invoice=" + this.getInvoice() +
                ", successfulPayment=" + this.getSuccessfulPayment() +
                ", refundedPayment=" + this.getRefundedPayment() +
                ", usersShared=" + this.getUsersShared() +
                ", chatShared=" + this.getChatShared() +
                ", connectedWebsite=" + this.getConnectedWebsite() +
                ", writeAccessAllowed=" + this.getWriteAccessAllowed() +
                ", passportData=" + this.getPassportData() +
                ", proximityAlertTriggered=" + this.getProximityAlertTriggered() +
                ", chatBoostAdded=" + this.getChatBoostAdded() +
                ", chatBackground=" + this.getChatBackground() +
                ", forumTopicCreated=" + this.getForumTopicCreated() +
                ", forumTopicEdited=" + this.getForumTopicEdited() +
                ", forumTopicClosed=" + this.getForumTopicClosed() +
                ", forumTopicReopened=" + this.getForumTopicReopened() +
                ", generalForumTopicHidden=" + this.getGeneralForumTopicHidden() +
                ", generalForumTopicUnhidden=" + this.getGeneralForumTopicUnhidden() +
                ", giveawayCreated=" + this.getGiveawayCreated() +
                ", giveaway=" + this.getGiveaway() +
                ", giveawayWinners=" + this.getGiveawayWinners() +
                ", giveawayCompleted=" + this.getGiveawayCompleted() +
                ", videoChatScheduled=" + this.getVideoChatScheduled() +
                ", videoChatStarted=" + this.getVideoChatStarted() +
                ", videoChatEnded=" + this.getVideoChatEnded() +
                ", videoChatParticipantsInvited=" + this.getVideoChatParticipantsInvited() +
                ", webAppData=" + this.getWebAppData() +
                ", replyMarkup=" + this.getReplyMarkup() +
                ", chatId=" + this.getChatId() + ")";
    }

    public Message() {
    }

    public Message(Integer messageId, Integer messageThreadId, User from, Chat senderChat, Integer senderBoostCount, User senderBusinessBot, Integer date,
                   String businessConnectionId, Chat chat, MessageOrigin forwardOrigin, Boolean isTopicMessage, Boolean isAutomaticForward, Message replyToMessage,
                   ExternalReplyInfo externalReply, TextQuote quote, Story replyToStory, User viaBot, Integer editData, Boolean hasProtectedContent,
                   Boolean isFromOffline, String mediaGroupId, String authorSignature, String text, List<MessageEntity> entities, LinkPreviewOptions linkPreviewOptions,
                   String effectId, Animation animation, Audio audio, Document document, PaidMediaInfo paidMedia, List<PhotoSize> photo, Sticker sticker, Story story,
                   Video video, VideoNote videoNote, Voice voice, String caption, List<MessageEntity> captionEntities, Boolean showCaptionAboveMedia,
                   Boolean hasMediaSpoiler, Contact contact, Dice dice, Game game, Poll poll, Venue venue, Location location, List<User> newChatMembers,
                   User leftChatMember, String newChatTitle, List<PhotoSize> newChatPhoto, Boolean deleteChatPhoto, Boolean groupChatCreated, Boolean supergroupChatCreated,
                   Boolean channelChatCreated, MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged, Long migrateToChatId, Long migrateFromChatId,
                   MaybeInaccessibleMessage pinnedMessage, Invoice invoice, SuccessfulPayment successfulPayment, RefundedPayment refundedPayment, UsersShared usersShared,
                   ChatShared chatShared, String connectedWebsite, WriteAccessAllowed writeAccessAllowed, PassportData passportData,
                   ProximityAlertTriggered proximityAlertTriggered, ChatBoostAdded chatBoostAdded, ChatBackground chatBackground, ForumTopicCreated forumTopicCreated,
                   ForumTopicEdited forumTopicEdited, ForumTopicClosed forumTopicClosed, ForumTopicReopened forumTopicReopened,
                   GeneralForumTopicHidden generalForumTopicHidden, GeneralForumTopicUnhidden generalForumTopicUnhidden, GiveawayCreated giveawayCreated, Giveaway giveaway,
                   GiveawayWinners giveawayWinners, GiveawayCompleted giveawayCompleted, VideoChatScheduled videoChatScheduled, VideoChatStarted videoChatStarted,
                   VideoChatEnded videoChatEnded, VideoChatParticipantsInvited videoChatParticipantsInvited, WebAppData webAppData, InlineKeyboardMarkup replyMarkup) {
        this.messageId = messageId;
        this.messageThreadId = messageThreadId;
        this.from = from;
        this.senderChat = senderChat;
        this.senderBoostCount = senderBoostCount;
        this.senderBusinessBot = senderBusinessBot;
        this.date = date;
        this.businessConnectionId = businessConnectionId;
        this.chat = chat;
        this.forwardOrigin = forwardOrigin;
        this.isTopicMessage = isTopicMessage;
        this.isAutomaticForward = isAutomaticForward;
        this.replyToMessage = replyToMessage;
        this.externalReply = externalReply;
        this.quote = quote;
        this.replyToStory = replyToStory;
        this.viaBot = viaBot;
        this.editData = editData;
        this.hasProtectedContent = hasProtectedContent;
        this.isFromOffline = isFromOffline;
        this.mediaGroupId = mediaGroupId;
        this.authorSignature = authorSignature;
        this.text = text;
        this.entities = entities;
        this.linkPreviewOptions = linkPreviewOptions;
        this.effectId = effectId;
        this.animation = animation;
        this.audio = audio;
        this.document = document;
        this.paidMedia = paidMedia;
        this.photo = photo;
        this.sticker = sticker;
        this.story = story;
        this.video = video;
        this.videoNote = videoNote;
        this.voice = voice;
        this.caption = caption;
        this.captionEntities = captionEntities;
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        this.hasMediaSpoiler = hasMediaSpoiler;
        this.contact = contact;
        this.dice = dice;
        this.game = game;
        this.poll = poll;
        this.venue = venue;
        this.location = location;
        this.newChatMembers = newChatMembers;
        this.leftChatMember = leftChatMember;
        this.newChatTitle = newChatTitle;
        this.newChatPhoto = newChatPhoto;
        this.deleteChatPhoto = deleteChatPhoto;
        this.groupChatCreated = groupChatCreated;
        this.supergroupChatCreated = supergroupChatCreated;
        this.channelChatCreated = channelChatCreated;
        this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
        this.migrateToChatId = migrateToChatId;
        this.migrateFromChatId = migrateFromChatId;
        this.pinnedMessage = pinnedMessage;
        this.invoice = invoice;
        this.successfulPayment = successfulPayment;
        this.refundedPayment = refundedPayment;
        this.usersShared = usersShared;
        this.chatShared = chatShared;
        this.connectedWebsite = connectedWebsite;
        this.writeAccessAllowed = writeAccessAllowed;
        this.passportData = passportData;
        this.proximityAlertTriggered = proximityAlertTriggered;
        this.chatBoostAdded = chatBoostAdded;
        this.chatBackground = chatBackground;
        this.forumTopicCreated = forumTopicCreated;
        this.forumTopicEdited = forumTopicEdited;
        this.forumTopicClosed = forumTopicClosed;
        this.forumTopicReopened = forumTopicReopened;
        this.generalForumTopicHidden = generalForumTopicHidden;
        this.generalForumTopicUnhidden = generalForumTopicUnhidden;
        this.giveawayCreated = giveawayCreated;
        this.giveaway = giveaway;
        this.giveawayWinners = giveawayWinners;
        this.giveawayCompleted = giveawayCompleted;
        this.videoChatScheduled = videoChatScheduled;
        this.videoChatStarted = videoChatStarted;
        this.videoChatEnded = videoChatEnded;
        this.videoChatParticipantsInvited = videoChatParticipantsInvited;
        this.webAppData = webAppData;
        this.replyMarkup = replyMarkup;
    }
}
