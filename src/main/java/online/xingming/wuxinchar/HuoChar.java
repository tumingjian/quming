package online.xingming.wuxinchar;

/**
 * Created by tumingjian on 2017/12/23.
 */
public class HuoChar extends WuxinCharacter {
//    public HuoChar(){
//        putAll(map(2,"刁丁力二了"));
//        putAll(map(3,"巳彳孓丈女大勺弋乇幺"));
//        putAll(map(4,"井中仃止火仂支之尺内仉日太天屯午爻丹吊"));
//        putAll(map(5,"它仗田令丙只代冬旦叻他奴冉仝尼立氐另叨叮左尥召奶"));
//        putAll(map(6,"弛年乓决忉旯劣全六打至氖旨甪老兆尖耒囡吃仲氘吆妄佤氽她同匠自多耳光宅肉旮亘"));
//        putAll(map(7,"佁免托佗妥卵辵犴巫足妖伶求努佞灾町佃忐忑甸占男廷姊佟彤吞弄呐妒牢呔志豸吝甙旰灼玏囤灸豆盯疔但玎住弟低妐吕呈利良"));
//        putAll(map(8,"帖定投咚侗抖忝耵坼佰炒弢帑咄剁佴戾玓到的佯炎昕狄哎冽昉罔宕徂两呤侍佻底侽例念仑妮耷呶妲剌佬昆典沓奈肋侈佽明炊囹坴旻店乳炅昊戽来炔妾长侣咎岱弩抉炕姐争忠帙制直知政隹卓炙折找易"));
//        putAll(map(9,"纨炸祉抶拓炱怨拉咧俊怒玦厘致炯柬姞咴烀曷拐赴炭歪拎招畋哪映殄昭娜律柰突虐涂昱贞亮怜俐耐南盅拖俚炳者胄秭眈待殃炫段亭重订酊炮炷耔紃纣殆肟怛咬怠哚哆籽盾帝徉抽盹抵祋奏"));
//        putAll(map(10,"笫肭衲恣纳庭拿衄娖耄倮伦挺恁唐玷肽爹趿朔晌偌蚋恕瓞条旃秦展哦珍恧站娘孬挑朊晊朗耻祝罜倘冻倔恫珏耽蚪烙秩晋疾翀晄恍烘耿衷斗紞留玳凌瓴玲烤烈舯料值凉娣俩哧朕倬岛娌哩倒肢旅疸窈倭屉特烜徒讯秧舀庹讨烊恬畜迅疼夏娭乌套挖倜彖"));
//        putAll(map(11,"珣啄啖讷聃婥聊捉窒痔从凑斩猁珕戚唳您眵袋将胬梁绐带张啶晞章粒动动悌翎略聆蛉舳珥羚阨捋舵敚鹿娄烯焐卤顶啁蛃侦帐剔斛那甜囵焓蛋晗羝欸诶晡珞采烽焊捭觖翋狼珽执贪唾梨徕珧勒袒停狸胎敕晟啕烃犁酞豚烷诀软挽眦狷振"));
//        putAll(map(12,"迪邸裂焚屠就邰捩毯诋晾悼祧登程塍迢蛘捺跆盗媛掭虏琌轴掇掣酡惦跌掏场琅敦惇焯稂哲短痘耋睇探喔腆掂抡跎阽欻臸喋幄琉痛硫劳掠巽痢詈轶痣焜单婷捻量嗟吭贷啼钬娲掰趔接诊焦粢彘轸轸理傣智厥焙焱喃喇赧轺婻贴惋饨氮喱晶能晴犂啦傈婼闰嗒循惘寻"));
//        putAll(map(13,"蜕煅旒跺惰媸酪冢嗤躲顽顿廊偻置迹雉愣蜊幌晃诙驮赁焕煨煺煳裎退煌睐炼煎烦零畹啷炜脱脘里郅陀诔傫觥驰嗵煸稔乃传虞睦追煏照琢揇迨艇蜓扬嗲旸炀乱煤觜盏赀烟农提暖靼琰詹恼惴猱绨煜逄搭趑当砀煊亶赂稗蜇偬痰塔禄罩旸路熄牒揲督徭逃殿辂鼎电跳訾煲琭"));
//        putAll(map(14,"搪台蜩郎摇尽奁连喏嫘瘩毓嫪疟耥趟缁慆搌搦绰煽熬蜿酹慝辣瞅矁恺熔鞅裳罱嘞通绾炝态舔叹疡瘌滕裸图逐领窝赵纶绫惕团透这腕嫡瑄嘀裹荧裼递裰辄对端畅陋诶逗喽熘种绿尘夺胨绺肈尔嫠雒郖寥嫜嫩僚祯逞胀逖彰捣宁绽廖踉幛缀粼腚瑙伙"));
//        putAll(map(15,"赉皑董蝶肿陡逮辎践憃调缎腰阆奖腠噘褚德敌除摎禚逴辍骶质辋缔儋缒缓瑶驻弹蜗髫褡踔饵憏进踮脑谈铽辇彻馁獐闹鲁熵熠搂噢征熨逯踏戮骀熛鸩折抟僻挪踢僾缇刘寮阵瘤厉辆谅驽热褪侬练摘嘹鼐层瑭轮论账郯诤暂噌齿躺熳驼乐燏唠脶蝻踟黎羰虑腩赕撂"));
//        putAll(map(16,"龙俦踱头陈惮璃瘴蹄猪遛哝赭遁谘璇燔焖陵道诺灯撑达燚憝晓廪掸陆赘遖蹀赌踵殚熹鲇曈都骆吨谛挠导醍谑炖璋撰录撤瘘卢晔螗积糖燃撅焰陶炽缡罹琏逎瑾擂昙烧烨鸱鲐燊鸯獗腽遂历暾赖鸵绦髭辏臻燠褴燎撩螂撮橐谍捞獠"));
//        putAll(map(17,"爵蟑餲纵蹋嚏遢麋臀痨饧螳儡灿阑缧瞳隶烛燮谣丑挡醣襄膛缕蹈螺魉隆临疃骋殓蛰励缪遥绩暧螽烩疗辗鸸鲕瞵龀褶磷择燧挝懔騃膣瞠燥繇瘅耧担黏队黛琎裢誊咛蝼"));
//        putAll(map(18,"焘懦癜阗障丛鹈题擢适耨曙曛戳戴抬蛲餮瞻怼辘职贽遮侓魍痴鲤噜烬粮谪缭璐骓丰膦断耢曜鞮虫转厘礼谬"));
//        putAll(map(19,"羸韬摆齑辽歠骴邻氇哒庞裣蹻辚曝遴鲷离谲证丽谭鼗呖烁掷际爆鲻觯绎帘臁赠蠊脸类蹶郑胴撵撸庐鲶鄩郸鄣蹲胆玺鸫裆薆蹭蠃蟆邓嘲馏辙脓蛏鲮咙"));
//        putAll(map(20,"醴挞宝嚼龆矍党黧獭躅飘龄鲽罗耀鼍懒赢瓆阐赡拢胧炉骘腾骝掳疠糯曦窦"));
//        putAll(map(21,"踌髅鳎烂鳐蜡珑傩览斓癞骡迩馔鹞俪爝袜疬跻啭缠累灶龇鲦腊曩瓐"));
//        putAll(map(22,"颤囊鲢躐驎叠聋癃窿胪粝孪鹨摄赎傥饕箨弯鹧鸷踬舻龛觌籴读邋龊趸听鳓"));
//        putAll(map(23,"栾恋挛猡轳麟鳞晒鹩摊蛎体显雠"));
//        putAll(map(24,"闼让瘫癫鞑龌鹭鳣谰蠹鳢陇攫螭雳灵粜厅叆揽鬣囔颅脔酃摞纛郦攮瘰驴逻逦鲈骧谠缆鸬魑跞轹骊躏鸾鲡鹂馕"));
//    }
}
