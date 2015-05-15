package org.openflashchart.elements;

/**
 *  The scatter graphic
 * {
 "elements":	[{
 "dot-size":	3,
 "text":	"My name is Scatter",
 "type":	"scatter",
 "values":	[{"x":0.0,"y":1.0},{"x":-0.9589242746631385,"y":0.28366218546322625},{"x":-0.5440211108893698,"y":-0.8390715290764524},{"x":0.6502878401571168,"y":-0.7596879128588213},{"x":0.9129452507276277,"y":0.40808206181339196},{"x":-0.13235175009777303,"y":0.9912028118634736},{"x":-0.9880316240928618,"y":0.15425144988758405},{"x":-0.428182669496151,"y":-0.9036922050915067},{"x":0.7451131604793488,"y":-0.6669380616522619},{"x":0.8509035245341184,"y":0.5253219888177297},{"x":-0.26237485370392877,"y":0.9649660284921133},{"x":-0.9997551733586199,"y":0.022126756261955736},{"x":-0.3048106211022167,"y":-0.9524129804151563},{"x":0.8268286794901034,"y":-0.562453851238172},{"x":0.7738906815578891,"y":0.6333192030862999},{"x":-0.38778163540943045,"y":0.9217512697247493},{"x":-0.9938886539233752,"y":-0.11038724383904756},{"x":-0.1760756199485871,"y":-0.9843766433940419},{"x":0.8939966636005579,"y":-0.4480736161291702},{"x":0.683261714736121,"y":0.7301735609948197},{"x":-0.5063656411097588,"y":0.8623188722876839},{"x":-0.9705352835374847,"y":-0.24095904923620143},{"x":-0.044242678085070965,"y":-0.999020813314648},{"x":0.9454353340247703,"y":-0.3258098052199642},{"x":0.5806111842123143,"y":0.8141809705265618},{"x":-0.6160404591886565,"y":0.7877145121442345},{"x":-0.9301059501867618,"y":-0.3672913304546965},{"x":0.08836868610400143,"y":-0.9960878351411849},{"x":0.9802396594403116,"y":-0.19781357400426822},{"x":0.4677451620451334,"y":0.8838633737085002},{"x":-0.7148764296291646,"y":0.6992508064783751},{"x":-0.8733119827746476,"y":-0.48716134980334147},{"x":0.21942525837900473,"y":-0.9756293127952373},{"x":0.9977972794498907,"y":-0.06633693633562374},{"x":0.3466494554970303,"y":0.9379947521194415},{"x":-0.8011345951780408,"y":0.5984842190140996},{"x":-0.8011526357338304,"y":-0.5984600690578581},{"x":0.346621180094276,"y":-0.9380052012169503},{"x":0.9977992786806003,"y":0.06630685835171127},{"x":0.21945466799406363,"y":0.9756226979194443},{"x":-0.8732972972139946,"y":0.4871876750070059},{"x":-0.7148975077677643,"y":-0.6992292566729736},{"x":0.46771851834275896,"y":-0.8838774731823718},{"x":0.9802456219572225,"y":0.19778402522372224},{"x":0.08839871248753149,"y":0.9960851708717215},{"x":-0.9300948780045254,"y":0.36731936773024515},{"x":-0.6160642040533645,"y":-0.787695941645058},{"x":0.5805866409896447,"y":-0.8141984723053473},{"x":0.9454451549211168,"y":0.32578130553514806},{"x":-0.04421256322855966,"y":0.9990221465276736},{"x":-0.9705280195418053,"y":0.24098830528525864},{"x":-0.5063916349244909,"y":-0.8623036078310824},{"x":0.6832397038158508,"y":-0.7301941571456378},{"x":0.8940101700837942,"y":0.44804666697426215},{"x":-0.1760459464712114,"y":0.9843819506325049},{"x":-0.9938853259197261,"y":0.11041720391967796},{"x":-0.3878094208292295,"y":-0.9217395798793158},{"x":0.7738715902084317,"y":-0.6333425312327234},{"x":0.8268456339220814,"y":0.5624289267667438},{"x":-0.30478191109030295,"y":0.9524221683015063},{"x":-0.9997558399011495,"y":-0.022096619278683942},{"x":-0.2624039418616639,"y":-0.9649581189333869},{"x":0.8508876886558596,"y":-0.5253476385155728},{"x":0.7451332645574127,"y":0.6669156003948422},{"x":-0.42815542808445156,"y":0.903705111970614},{"x":-0.9880362734541701,"y":-0.15422166624309427},{"x":-0.13238162920545193,"y":-0.9911988217552068},{"x":0.9129329489429682,"y":-0.40810958177221934},{"x":0.6503107401625525,"y":0.7596683100072248},{"x":-0.5439958173735323,"y":0.8390879278598296},{"x":-0.9589328250406132,"y":-0.28363327918216646},{"x":"-3.014435335948845E-5","y":-0.999999999545659}]
 }],

 "x_axis":{
 "min":	-2,
 "colour":	"#FF0000",
 "max":	2
 },

 "y_axis":{
 "min":	-2,
 "colour":	"#00FF00",
 "max":	2
 }

 }

 * 
 * @author zhuzhenhua
 * 
 * @time Jul 30, 200810:47:24 AM
 */
public class Scatter extends Element {

	/** the dot's size of Scatter*/
	private Integer dot__size;

	public Scatter() {
		this.type = this.getClass().getSimpleName().toLowerCase();
	}

	public Scatter(String text) {
		this();
		this.text = text;
	}

	/**
	 * @param dot__size
	 *            the dot__size to set
	 */
	public void setDot__size(Integer dot__size) {
		this.dot__size = dot__size;
	}

	/**
	 * @return the dot__size
	 */
	public Integer getDot__size() {
		return dot__size;
	}

}