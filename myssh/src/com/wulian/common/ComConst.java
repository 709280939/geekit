package com.wulian.common;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ComConst {
	public static final String TraceTourist_TablePre = "TraceTourist";
	public static final String Strategy_TablePre = "Strategy";
	public static final String Strategymap_TablePre = "Strategymap";
	
	public static final String  STRUCT2_CFG= "hibernate.cfg.xml";
	
	public static final String telephoneSession="tel";
	public static final String telPattern = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	
	public static final String  PicType[] ={"jpg","jpeg","png","gif","bmp"};
	public static final String  VideoType[] ={"mp4","avi","mpeg","wav"};
	
	public static final int UpfileNum = 50;
	public static final int BUFFER_SIZE =1024*16;
	public static final String BackSlash = "/";
	
	//common
	public static final String especialWord = "@";
	public static final String Flag = "flag";
	public static final String Result = "result";
	public static final String Lng = "lng";
	public static final String Lat = "lat";
	public static final String ContentType="multipart/form-data";
	public static final String defaultUserName = "匿名";
	public static final String defaultreturn = "提交成功,谢谢";
	public static final String CommVideo = "video";
	public static final String CommTrace = "trace";
		
//**************************get part************************************	
	//scenic
	public static final String SCENICLIST_priviceID = "priviceID";
	public static final String SCENICLIST_cityID = "cityID";
	public static final String SEARCHSCENIC_sceName = "sceName";
	
	
	//adapt
	public static final String ADAPT_zoom = "zoom";
	public static final String ADAPT_LDP_lng = "LDP.lng";
	public static final String ADAPT_LDP_lat = "LDP.lat";
	public static final String ADAPT_RUP_lng = "RUP.lng";
	public static final String ADAPT_RUP_lat = "RUP.lat";
//**************************post part***********************************	
	
	//tourist
	public static final String TouristID = "TourID";
	public static final String TouristTel = "TEL";
	public static final String TouristPWD = "PWD";
	public static final String TouristPic = "Pic";
	public static final String TouristQQ = "QQ";
	public static final String TouristEmail ="Email";
	public static final String TouristWeibo = "Weibo";
	public static final String TouristWechat = "Wechat";
	public static final String TouristAddress = "Address";
	public static final String TouristNickname = "Nickname";
	public static final String TouristSex = "Sex";
	public static final String TouristAge = "Age";
	public static final String TouristPhoto = "Photo";
	
	public static final String STARTTIME = "stime";
	public static final String ENDTIME = "etime";
	public static final String TEL = "tel";
	
	//trace	
	public static final String DEL_DATA = "deldata";//删除旅游记录的组合信息 lxg
	
	public static final String TraceLng = "lng";
	public static final String TraceLat = "lat";
	public static final String TraceTime =  "time";
	public static final String TracePic =  "picUrl";
	public static final String TraceVideo = "videoURL";
	public static final String TracePicNum = "picNum";
	public static final String TraceVidNum = "vidNum";
	public static final String TracePicPath = "PicUrl";
	public static final String TraceVideoPath = "VideoUrl";
	public static final String TracePicResult = "PicUrls";
	public static final String TraceVideoResult = "VideoUrls";
	
	//provide
	public static final String ProvinceId = "provinceId";
	public static final String ProvinceName = "provinceName";
	
	
	//city
	public static final String City = "City";
	public static final String CityID = "cityID";
	public static final String CityName = "cityName";
		
	
	//scenic
	public static final String SceName = "sceName";
	public static final String SceStars = "stars";
	public static final String SceTicket = "ticket";
	public static final String SceWeather = "weather";
	public static final String ScePicUrl = "picUrl";
	public static final String SceID = "SceID";
	public static final String thirdTmp = "thirdTmp";
	
	//adapt
	public static final String SceNum = "sceNum";
	public static final String ScePic = "ScePic";
	public static final String SceWords = "SceWords";
	public static final String SceSoundUrl = "SceSoundUrl";
	public static final String SceVideoUrl = "SceVideoUrl";
	public static final String SceStgId = "stgId";
	public static final String SceStgName = "name";
	public static final String SceStgtime = "time";
	public static final String SceStgdistance = "distance";
	public static final String SceStgintroduction = "introduction";
	public static final String SceSeq = "seq";                   
	public static final String SceList = "list";
	 
	 
	//audio
	public static final String AUDIO_RAD = "RAD";
	public static final String AUDIO_URL = "URL";
	
	//vido
	public static final String VIDEO_CamID = "CamID";
	public static final String VIDEO_URL = "URL";
	
	//旅游记录
	public static final String TouristIDs="TouristID";
	public static final String TraceStartTime="TraceStartTime";
	public static final String TraceEndTime="TraceEndTime";
	public static final String TraceTitle="TraceTitle";
	
/***************************************返回值***************************************************************/	
	//tourist
	public static final String RegisterSuccess="注册成功,谢谢";
	public static final String LoginSuccess="登陆成功,谢谢";
	public static final String CMDError="没有命令参数";
	public static final String UrlParaError="参数错误";
	public static final String TelphoneError = "电话号码错误，请重新输入";
		
	public static final String TouristUpdateFail="更改失败,请再次更改并提交";
	public static final String TouristUpdateSuccess="更改成功,谢谢";
	public static final String IsAlreadyRegister ="手机已经注册";
	public static final String IsNotRegister="没有注册";
	public static final String RegisterError="注册忙，稍后再注册,给您带来不便请原谅";
	public static final String IsNotRight="密码错误";
	public static final String SubmitFail="提交失败";
	public static final String NoSesssionID="无会话ID,请先登陆";
	public static final String LogoutSuccess="已经退出，谢谢使用";
	
	//trace
	public static final String TraceSubmitSeccess="提交成功,谢谢";
	public static final String TracePLLT = "数据库错误";
	
	
	//Comment
	public static final String CommIndexError = "索引错误";
	
/***************************************统计信息***************************************************************/
	public static final String StatTime = "Time";
	public static final String StatTouristNum ="TouristNum";
	public static final String StatTraceNum= "TraceNum";
	public static final String StatEbusinessNum= "EbusinessNum";
	public static final String StatVideoNum= "VideoNum";
	public static final String StatAudioNum= "AudioNum";
	
	public static final int TRACEType = 1;
	public static final int EBUSINESSType = 2;
	public static final int VIDEOType = 3;
	public static final int AUDEOType = 4;
	public static final Map<Integer, String> StatType = new HashMap<Integer, String>();
	
	static
	{
		StatType.put(TRACEType, "旅迹");
		StatType.put(EBUSINESSType, "电商");
		StatType.put(VIDEOType, "实时在线视频");
		StatType.put(AUDEOType, "自动导游");
	}
	
/***************************************图片路径***************************************************************/
	public static final String ScePicsDir = "picture"+File.separator+"allsce";
	public static final String ScePicsDirUrl= "picture/allsce";
	public static final String Scethumb = "thumb";
	public static final String Sceorg = "org";
	public static final String ScePostFile = ".txt";
	public static final String SceSound = "sound.wav";
	public static final String SceBrodcatstVideo =".mp4";

/***************************************trace***************************************************************/
	public static final String TraceRoot ="trace";

	
/***************************************tourist***************************************************************/	
	public static final String TourPic = "tourist";
	public static final String TourRoot = "picture";
	
/***************************************main***************************************************************/	
	public static final int HotDefaultNumber = 50;
	public static final int AdvertiseDefaultNumber = 4;
	public static final int RecomVideoDefaultNumber = 12;
	public static final int RecomTraceDefaultNumber = 2;
	public static final int HotTraceDefaultNumber = 16;
	
	public static final String mainNum = "num";
	public static final String mainID = "ID";
	public static final String maincontent = "content";
	public static final String mainurl = "hosturl";
	public static final String mainname = "hostname";
	public static final String maintype = "type";
	public static final String maintime = "time";
	public static final String maintitle = "title";
	public static final String mainclick = "click";
	public static final String mainreview = "review";
	public static final String maincomment = "comment";
	public static final String mainindexID = "indexID";
	public static final String maincommentID = "commentID";
	public static final String mainproName = "proName";
	public static final String mainsityName = "sityName";
	public static final String mainsceName = "sceName";
	public static final String maincameraid = "cameraid";
	public static final String mainvideopath = "videopath";
	public static final String mainpicpath = "picpath";
	public static final String maintracetable ="tracetable";
	
/***************************************comment***************************************************************/	
	public static final String commenttype = "type";
	public static final String commentindexID = "indexID";
	public static final String commentlastcommid = "lastcommid";
	public static final String commentpage = "page";
	public static final String commentrow = "row";
	public static final String commentcommid = "commid";
	public static final String commentfartherid = "fartherid";
	public static final String commentcomment = "comment";
	public static final String commentvote = "vote";
	public static final String commenthate = "hate";
	public static final String commentuserid = "userid";
	public static final String commenturl = "hosturl";
	public static final String commentname = "hostname";
	public static final String commentnum = "num";
	public static final String commentcomtype = "comtype";
	public static final String commentend = "end";
	
	//table  表名
	
	public static final String Tourist = "Tourist";//用户登录信息记录表
}
