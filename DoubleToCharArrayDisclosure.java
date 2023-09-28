class DoubleToCharArrayDisclosure{
	public static void main(String[] args){
		double DoublePi = Math.acos(-1.0);
		
		for(int i=1;i<=100;i++){
			System.out.println("["+String.valueOf(DoubleToCharArray(DoublePi,52-i,52-i,42-i,3,3,0,5,10,1))+"]");
		}//i
	}//main
	
	static char[] DoubleToCharArray(double Value0,int DecimalOrderOrderNumber0,int SetWholeDigitOrderOrderNumber0,
		int SetDecimalOrderOrderNumber0,int SetWholeDigitOrderOrderNumberMarker0,int SetDecimalOrderOrderNumberMarker0,
		int PlusOrMinusSignMarker0,int RoundUpOneDigit0, int IntValueBase0, int LanguageKind0){
		
		final char CharAsciiNullCharacter = (char)0;
		final char CharAsciiHorizontalTab = (char)9;
		final char CharAsciiSpace = (char)32;
		final char CharAsciiUppercaseA = (char)65;
		final char CharAsciiUppercaseB = (char)66;
		final char CharAsciiUppercaseC = (char)67;
		final char CharAsciiUppercaseD = (char)68;
		final char CharAsciiUppercaseE = (char)69;
		final char CharAsciiUppercaseF = (char)70;
		final char CharAsciiUppercaseG = (char)71;
		final char CharAsciiUppercaseH = (char)72;
		final char CharAsciiUppercaseI = (char)73;
		final char CharAsciiUppercaseJ = (char)74;
		final char CharAsciiUppercaseK = (char)75;
		final char CharAsciiUppercaseL = (char)76;
		final char CharAsciiUppercaseM = (char)77;
		final char CharAsciiUppercaseN = (char)78;
		final char CharAsciiUppercaseO = (char)79;
		final char CharAsciiUppercaseP = (char)80;
		final char CharAsciiUppercaseQ = (char)81;
		final char CharAsciiUppercaseR = (char)82;
		final char CharAsciiUppercaseS = (char)83;
		final char CharAsciiUppercaseT = (char)84;
		final char CharAsciiUppercaseU = (char)85;
		final char CharAsciiUppercaseV = (char)86;
		final char CharAsciiUppercaseW = (char)87;
		final char CharAsciiUppercaseX = (char)88;
		final char CharAsciiUppercaseY = (char)89;
		final char CharAsciiUppercaseZ = (char)90;
		final char CharAsciiLowercaseA = (char)97;
		final char CharAsciiLowercaseB = (char)98;
		final char CharAsciiLowercaseC = (char)99;
		final char CharAsciiLowercaseD = (char)100;
		final char CharAsciiLowercaseE = (char)101;
		final char CharAsciiLowercaseF = (char)102;
		final char CharAsciiLowercaseG = (char)103;
		final char CharAsciiLowercaseH = (char)104;
		final char CharAsciiLowercaseI = (char)105;
		final char CharAsciiLowercaseJ = (char)106;
		final char CharAsciiLowercaseK = (char)107;
		final char CharAsciiLowercaseL = (char)108;
		final char CharAsciiLowercaseM = (char)109;
		final char CharAsciiLowercaseN = (char)110;
		final char CharAsciiLowercaseO = (char)111;
		final char CharAsciiLowercaseP = (char)112;
		final char CharAsciiLowercaseQ = (char)113;
		final char CharAsciiLowercaseR = (char)114;
		final char CharAsciiLowercaseS = (char)115;
		final char CharAsciiLowercaseT = (char)116;
		final char CharAsciiLowercaseU = (char)117;
		final char CharAsciiLowercaseV = (char)118;
		final char CharAsciiLowercaseW = (char)119;
		final char CharAsciiLowercaseX = (char)120;
		final char CharAsciiLowercaseY = (char)121;
		final char CharAsciiLowercaseZ = (char)122;
		
		final char CharZeroDigit = '0';
		final char CharOneDigit = '1';
		final char CharTwoDigit = '2';
		final char CharThreeDigit = '3';
		final char CharFourDigit = '4';
		final char CharFiveDigit = '5';
		final char CharSixDigit = '6';
		final char CharSevenDigit = '7';
		final char CharEightDigit = '8';
		final char CharNineDigit = '9';
		final char CharADigit = CharAsciiUppercaseA;
		final char CharBDigit = CharAsciiUppercaseB;
		final char CharCDigit = CharAsciiUppercaseC;
		final char CharDDigit = CharAsciiUppercaseD;
		final char CharEDigit = CharAsciiUppercaseE;
		final char CharFDigit = CharAsciiUppercaseF;
		
		final String StringFirstApplicationLanguageDotOperator = ".";
		final String StringFirstApplicationLanguagePlusSignOperator = "+";
		final String StringFirstApplicationLanguageMinusSignOperator = "-";
		final String StringFirstApplicationLanguageExponentialOperator = "E";
		final String StringFirstApplicationLanguageNullDigit = "null";
		final String StringFirstApplicationLanguageCarryUpDigit = "1";
		final String StringFirstApplicationLanguagePrefixDigit = "0";
		final String StringFirstApplicationLanguageSuffixDigit = "0";
		final String StringFirstApplicationLanguageZeroNormalDigit = "0";
		final String StringFirstApplicationLanguageOneNormalDigit = "1";
		final String StringFirstApplicationLanguageTwoNormalDigit = "2";
		final String StringFirstApplicationLanguageThreeNormalDigit = "3";
		final String StringFirstApplicationLanguageFourNormalDigit = "4";
		final String StringFirstApplicationLanguageFiveNormalDigit = "5";
		final String StringFirstApplicationLanguageSixNormalDigit = "6";
		final String StringFirstApplicationLanguageSevenNormalDigit = "7";
		final String StringFirstApplicationLanguageEightNormalDigit = "8";
		final String StringFirstApplicationLanguageNineNormalDigit = "9";
		final String StringFirstApplicationLanguageANormalDigit = String.valueOf(CharAsciiUppercaseA);
		final String StringFirstApplicationLanguageBNormalDigit = String.valueOf(CharAsciiUppercaseB);
		final String StringFirstApplicationLanguageCNormalDigit = String.valueOf(CharAsciiUppercaseC);
		final String StringFirstApplicationLanguageDNormalDigit = String.valueOf(CharAsciiUppercaseD);
		final String StringFirstApplicationLanguageENormalDigit = String.valueOf(CharAsciiUppercaseE);
		final String StringFirstApplicationLanguageFNormalDigit = String.valueOf(CharAsciiUppercaseF);
			
		final String StringSecondApplicationLanguageDotOperator = "<.>";
		final String StringSecondApplicationLanguagePlusSignOperator = "[Plus]";
		final String StringSecondApplicationLanguageMinusSignOperator = "[Minus]";
		final String StringSecondApplicationLanguageExponentialOperator = "<Exponential>";
		final String StringSecondApplicationLanguageNullDigit = "{Null}";
		final String StringSecondApplicationLanguageCarryUpDigit = "[CarryUpOne]";
		final String StringSecondApplicationLanguagePrefixDigit = "(Prefix Zero)";
		final String StringSecondApplicationLanguageSuffixDigit = "(Surfix Zero)";
		final String StringSecondApplicationLanguageZeroNormalDigit = "Zero";
		final String StringSecondApplicationLanguageOneNormalDigit = "One";
		final String StringSecondApplicationLanguageTwoNormalDigit = "Two";
		final String StringSecondApplicationLanguageThreeNormalDigit = "Three";
		final String StringSecondApplicationLanguageFourNormalDigit = "Four";
		final String StringSecondApplicationLanguageFiveNormalDigit = "Five";
		final String StringSecondApplicationLanguageSixNormalDigit = "Six";
		final String StringSecondApplicationLanguageSevenNormalDigit = "Seven";
		final String StringSecondApplicationLanguageEightNormalDigit = "Eight";
		final String StringSecondApplicationLanguageNineNormalDigit = "Nine";
		final String StringSecondApplicationLanguageANormalDigit = "[A]";
		final String StringSecondApplicationLanguageBNormalDigit = "{B}";
		final String StringSecondApplicationLanguageCNormalDigit = "((C))";
		final String StringSecondApplicationLanguageDNormalDigit = "<D>";
		final String StringSecondApplicationLanguageENormalDigit = "/E/";
		final String StringSecondApplicationLanguageFNormalDigit = "#F#";
			
		final char[] CharLowercaseD = {CharAsciiLowercaseD};
		final char[] CharLowercaseF = {CharAsciiLowercaseF};
		final char[] CharLowercaseLF = {CharAsciiLowercaseL,CharAsciiLowercaseF};
			
		final String StringPercentage = "%";
		final String StringValue = "Value";
		final String StringBase = "Base";
		final String StringPower = "Power";
		final String StringLowercaseD = String.valueOf(CharLowercaseD);
		final String StringLowercaseF = String.valueOf(CharLowercaseF);
		final String StringLowercaseLF = String.valueOf(CharLowercaseLF);
		final String StringRoundLeftBracket = "(";
		final String StringRoundRightBracket = ")";
			
		final String StringNullCharacterBlank = String.valueOf(CharAsciiNullCharacter);
		final String StringHorizontalTabBlank = String.valueOf(CharAsciiHorizontalTab);
		final String StringSpaceBlank = String.valueOf(CharAsciiSpace);
		
		final int UndefinedApplicationTokenType = 0;
		final int FormatStringApplicationTokenType = 1;
		final int ValueApplicationTokenType = 2;
		final int LeftBracketApplicationTokenType = 3;
		final int RightBracketApplicationTokenType = 4;
		final int ArgumentStatementApplicationTokenType = 5;
		final int DigitApplicationTokenType = 6;
		final int NullDigitApplicationTokenType = 7;
		final int SuffixDigitApplicationTokenType = 8;
		final int PrefixDigitApplicationTokenType = 9;
		final int CarryUpDigitApplicationTokenType = 10;
		final int MinusSignOperatorApplicationTokenType = 11;
		final int PlusSignOperatorApplicationTokenType = 12;
		final int ExponentialOperatorApplicationTokenType = 13;
		final int DotOperatorApplicationTokenType = 14;
		final int BlankApplicationTokenType = 15;
		final int MaxParameterApplicationTokenType = 15;

		final int UndefinedApplicationTokenStringNumber = 0;
		final int FormatStringApplicationTokenStringNumber = 1;
		final int MaxFormatStringApplicationTokenStringNumber = 1;
		final int ValueValueApplicationTokenStringNumber = 1;
		final int BaseValueApplicationTokenStringNumber = 2;
		final int PowerValueApplicationTokenStringNumber = 3;
		final int DValueApplicationTokenStringNumber = 4;
		final int FValueApplicationTokenStringNumber = 5;
		final int LfValueApplicationTokenStringNumber = 6;
		final int MaxValueApplicationTokenStringNumber = 6;
		final int RoundLeftBracketApplicationTokenStringNumber = 1;
		final int MaxLeftBracketApplicationTokenStringNumber = 1;
		final int RoundRightBracketApplicationTokenStringNumber = 1;
		final int MaxRightBracketApplicationTokenStringNumber = 1;
		final int PercentageArgumentStatementApplicationTokenStringNumber = 1;
		final int MaxArgumentStatementApplicationTokenStringNumber = 1;
		final int ZeroNormalDigitApplicationTokenStringNumber = 1;
		final int OneNormalDigitApplicationTokenStringNumber = 2;
		final int TwoNormalDigitApplicationTokenStringNumber = 3;
		final int ThreeNormalDigitApplicationTokenStringNumber = 4;
		final int FourNormalDigitApplicationTokenStringNumber = 5;
		final int FiveNormalDigitApplicationTokenStringNumber = 6;
		final int SixNormalDigitApplicationTokenStringNumber = 7;
		final int SevenNormalDigitApplicationTokenStringNumber = 8;
		final int EightNormalDigitApplicationTokenStringNumber = 9;
		final int NineNormalDigitApplicationTokenStringNumber = 10;
		final int ANormalDigitApplicationTokenStringNumber = 11;
		final int BNormalDigitApplicationTokenStringNumber = 12;
		final int CNormalDigitApplicationTokenStringNumber = 13;
		final int DNormalDigitApplicationTokenStringNumber = 14;
		final int ENormalDigitApplicationTokenStringNumber = 15;
		final int FNormalDigitApplicationTokenStringNumber = 16;
		final int MaxNormalDigitApplicationTokenStringNumber = 16;
		final int NullDigitApplicationTokenStringNumber = 1;
		final int MaxNullDigitApplicationTokenStringNumber = 1;
		final int SuffixDigitApplicationTokenStringNumber = 1;
		final int MaxSuffixDigitApplicationTokenStringNumber = 1;
		final int PrefixDigitApplicationTokenStringNumber = 1;
		final int MaxPrefixDigitApplicationTokenStringNumber = 1;
		final int CarryUpDigitApplicationTokenStringNumber = 1;
		final int MaxCarryUpDigitApplicationTokenStringNumber = 1;
		final int MinusSignOperatorApplicationTokenStringNumber = 1;
		final int MaxMinusSignOperatorApplicationTokenStringNumber = 1;
		final int PlusSignOperatorApplicationTokenStringNumber = 1;
		final int MaxPlusSignOperatorApplicationTokenStringNumber = 1;
		final int ExponentialOperatorApplicationTokenStringNumber = 1;
		final int MaxExponentialOperatorApplicationTokenStringNumber = 1;
		final int DotOperatorApplicationTokenStringNumber = 1;
		final int MaxDotOperatorApplicationTokenStringNumber = 1;
		final int NullCharacterBlankApplicationTokenStringNumber = 1;
		final int HorizontalTabBlankApplicationTokenStringNumber = 2;
		final int SpaceBlankApplicationTokenStringNumber = 3;
		final int MaxBlankApplicationTokenStringNumber = 3;
			
		int[] OriginalOrderNumberUnitTotalPartialOrderNumbers = null;
		int[] OriginalOrderNumberUnitMaxPartialOrderNumbers = null;
		int[] OriginalOrderNumberUnitTotalPartialValidOrderNumbers = null;
		int[] OriginalOrderNumberUnitMaxPartialValidOrderNumbers = null;
		int[] OriginalOrderNumberUnitTotalPartialOrderCharNumbers = null;
		int[] OriginalOrderNumberUnitMaxPartialOrderCharNumbers = null;
			
		int[] OriginalOrderCharNumberUnitMaxPartialOrderCharNumbers = null;
		int[] OriginalOrderCharNumberUnitTotalPartialOrderCharNumbers = null;
		int[] PartialOrderTypeCutTotalPartialOrderCharNumbers = null;
		int[] OriginalOrderCharNumberUnitWholePartialOrderNumbers = null;
			
		int[] OriginalValidOrderCharNumberUnitMaxPartialOrderCharNumbers = null;
		int[] OriginalValidOrderCharNumberUnitTotalPartialOrderCharNumbers = null;
		int[] OriginalValidOrderCharNumberUnitWholePartialOrderNumbers = null;
			
		char[] CharDoubleValue = null;
			
		int ValueToCharArrayEndMarker = 0;
		final int UndefinedApplicationOrderType = 0;
		final int UndefinedApplicationOrderKind = 0;
		final int DecimalOrderOrderNumberValueApplicationOrderType = 1;
		final int WholeDigitOrderOrderNumberValueApplicationOrderType = 2;
		final int CarryUpDigitValueApplicationOrderType = 3;
		final int SuffixValueApplicationOrderType = 4;
		final int PrefixValueApplicationOrderType = 5;
		final int PlusOrMinusSignValueApplicationOrderType = 6;
		final int DotValueApplicationOrderType = 7;
		final int NullValueApplicationOrderType = 8;
		final int MaxValueApplicationOrderType = 8;
			
		int OriginalOrderTypeLoopTime = 0;
		int OriginalOrderTypeLoopTimeEndMarker = 0;
		int MaxOriginalOrderTypeLoopTime = 0;
		int PartialOrderTypeLoopTime = 0;
		int PartialOrderTypeLoopTimeEndMarker = 0;
		int MaxPartialOrderTypeLoopTime = 0;
		int OriginalOrderType = 0;
		int MaxOriginalOrderType = 0;
		int TotalOriginalOrderType = 0;
		int OriginalOrderTypeEndMarker = 0;
		int WholeOriginalOrderType = 0;
		int OriginalOrderTypeUnitMaxPartialOrderType = 0;
		int OrderType = 0;
		int MaxOrderType = 0;
		int TotalOrderType = 0;
		int OrderTypeEndMarker = 0;
		int WholeOrderType = 0;
		int PartialOrderType = 0;
		int MaxPartialOrderType = 0;
		int MaxOriginalPartialOrderType = 0;
		int PartialOrderTypeEndMarker = 0;
		int OrderTypeCountStartMarker = 0;
			
		int OriginalOrderNumber = 0;
		int MaxOriginalOrderNumber = 0;
		int TotalOriginalOrderNumber = 0;
		int OriginalOrderNumberEndMarker = 0;
		int WholeOriginalOrderNumber = 0;
		int PartialValidOrderNumber = 0;
		int MaxPartialValidOrderNumber = 0;
		int ValidOrderNumber = 0;
		int MaxValidOrderNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderNumber = 0;
		int OriginalOrderNumberUnitMaxPartialOrderNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitMaxPartialValidOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialValidOrderNumber = 0;
		int OriginalOrderNumberUnitMaxPartialValidOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber = 0;
		int OriginalOrderNumberUnitTotalPartialOrderNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber = 0;
		int OriginalOrderNumberUnitTotalPartialValidOrderNumber = 0;
		int OriginalOrderNumberUnitWholePartialValidOrderNumber = 0;
		int OrderNumber = 0;
		int MaxOrderNumber = 0;
		int TotalOrderNumber = 0;
		int OrderNumberEndMarker = 0;
		int WholeOrderNumber = 0;
		int PartialOrderNumber = 0;
		int MaxPartialOrderNumber = 0;
		int MaxOriginalPartialOrderNumber = 0;
		int PartialOrderNumberEndMarker = 0;
		int OrderNumberCountStartMarker = 0;
		int PartialOrderNumberLoopTime = 0;
		int MaxPartialOrderNumberLoopTime = 0;
		int PartialOrderNumberLoopTimeEndMarker = 0;
			
		int PartialOrderCharNumberLoopTime = 0;
		int PartialOrderCharNumberLoopTimeEndMarker = 0;
		int MaxPartialOrderCharNumberLoopTime = 0;
		int OriginalOrderCharNumber = 0;
		int MaxOriginalOrderCharNumber = 0;
		int TotalOriginalOrderCharNumber = 0;
		int OriginalOrderCharNumberEndMarker = 0;
		int WholeOriginalOrderCharNumber = 0;
		int OriginalOrderCharNumberUnitMaxPartialOrderCharNumber = 0;
		int OriginalOrderCharNumberUnitPartialOrderCharNumber = 0;
		int OriginalOrderNumberUnitOrderCharNumber = 0;
		int OrderCharNumber = 0;
		int MaxOrderCharNumber = 0;
		int TotalOrderCharNumber = 0;
		int OriginalOrderNumberUnitMaxOrderCharNumber = 0;
		int OriginalOrderNumberUnitTotalOrderCharNumber = 0;
		int OriginalOrderTypeUnitTotalOrderCharNumber = 0;
		int OrderCharNumberEndMarker = 0;
		int WholeOrderCharNumber = 0;
		int OriginalOrderCharNumberUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderTypeCutTotalPartialOrderCharNumber = 0;
		int PartialOrderTypeLoopTimeRewindPartialOrderTypeCutTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindPartialOrderTypeCutTotalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindPartialOrderTypeCutTotalPartialOrderCharNumber = 0;
			
		int OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = 0;
			
		int OriginalOrderCharNumberCutTotalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberCutTotalPartialOrderCharNumber = 0;
			
		int OriginalOrderTypeCutOriginalOrderCharNumberUnitWholePartialOrderCharNumber = 0;
		int OriginalOrderCharNumberUnitWholePartialOrderCharNumber = 0;
		int PartialOrderCharNumber = 0;
		int MaxPartialOrderCharNumber = 0;
		int MaxOriginalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberEndMarker = 0;
		int OrderCharNumberCountStartMarker = 0;
			
	 	int ValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
	 	int ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
	 	int DummyValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
	 	int DummyValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
		int DummyCarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker = 0;
	 	int DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 0;
		int CarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker = 0;
		int CarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 0;
		int OriginalOrderTypeUnitMaxOrderNumber = 0;
		int CarryUpDigitOrderNumber = 0;
		int IntValueBase = 0;
		int IntValueBaseErrorMarker = 0;
		int RoundUpOneDigit = 5;
	 	int SetWholeDigitOrderOrderNumber = 0;
		int SetDecimalOrderOrderNumber = 0;
	 	int SetWholeDigitOrderOrderNumberMarker = 0;
		int SetDecimalOrderOrderNumberMarker = 0;
		int WholeDigitOrderOrderNumberBeforeExponential = 0;
		int UndefinedApplicationPlusOrMinusSignStatus = 0;
		int MinusApplicationPlusOrMinusSignStatus = 1;
		int PlusApplicationPlusOrMinusSignStatus = 2;
		int PlusOrMinusSignStatus = UndefinedApplicationPlusOrMinusSignStatus;
		int IntPlusOrMinusSign = 0;
		int PlusOrMinusSignMarker = 0;
		int DummyRoundDownToZeroMarker = 0;
		int RoundDownToZeroMarker = 0;
		int DecimalOrderOrderNumber = 0;
		int WholeDigitOrderOrderNumber = 0;
		int LanguageKind = 0;
		final int FirstApplicationLanguageKind = 1;
		final int SecondApplicationLanguageKind = 2;
		double Value = 0.0;
		double AbsoluteValue = 0.0;
		double AbsoluteValueWholeDigitOrderPart = 0.0;
		double DummyAbsoluteValueWholeDigitOrderPart = 0.0;
		double AbsoluteValueDecimalOrderPart = 0.0;
		double DummyAbsoluteValueDecimalOrderPart = 0.0;
		int OriginalOneDigit = 0;
		int OriginalCarryUpOneDigit = 0;
		int OneDigit = 0;
		int CandidateCarryUpDecimalOrderMarker = 0;
		int OriginalTokenType = UndefinedApplicationTokenType;
		int TotalOriginalParameterArrayOrderType = 0;
		int MaxOriginalParameterArrayOrderType = 0;
		int TotalOriginalParameterArrayOrderNumber = 0;
		int MaxOriginalParameterArrayOrderNumber = 0;
		int TotalOriginalParameterArrayOrderCharNumber = 0;
		int MaxOriginalParameterArrayOrderCharNumber = 0;
		int OriginalParameterArrayOrderType = 0;
		int OriginalParameterArrayOrderNumber = 0;
		int OriginalParameterArrayOrderCharNumber = 0;
		char OriginalParameterArrayOrderOneChar = (char)0;
		int ParameterArrayOrderTypeUnitOutputDenialMarker = 0;
		int ParameterArrayOrderNumberUnitOutputDenialMarker = 0;
		int ParameterArrayOrderCharNumberUnitOutputDenialMarker = 0;
		int ParameterArrayOrderOneCharUnitOutputDenialMarker = 0;
		char OriginalOneChar = (char)0;
		char OneChar = (char)0;
		int LoopTime = 0;
		int MaxLoopTime = 0;
		int LoopTimeEndMarker = 0;
		int LoopTimeCountStartMarker = 0;
		int OriginalOrderNumberUnitWholePartialOrderNumber = 0;
		int OriginalOrderNumberUnitWholePartialOrderCharNumber = 0;
		int OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderCharNumber = 0;
		int OriginalOrderNumberUnitTotalPartialOrderCharNumber = 0;
		int OriginalOrderNumberUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderCharNumberUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderCharNumberUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindTotalOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxExponentialOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxDecimalOrderOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxWholeDigitOrderOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxCarryUpDigitOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxSuffixOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxPrefixOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxDotOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxNullOrderCharNumber = 0;
		int LoopTimeModulo2Plus1 = 0;
		int LoopTimeModulo2Plus1EndMarker = 0;
		final int MaxLoopTimeModulo2Plus1 = 2;
		int PartialOrderTypeValidityDenialMarker = 0;
		int PartialOrderNumberValidityDenialMarker = 0;
		int PartialOrderCharNumberValidityDenialMarker = 0;
		int OriginalOrderNumberUnitSubstitutingOrderCharNumber = 0;
		int SuffixOrderNumber = 0;
		int PrefixOrderNumber = 0;
		int PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderTypeUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber = 0;
		int PartialOrderTypeUnitTotalPartialOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderNumber = 0;
		int PartialOrderTypeUnitMaxPartialOrderNumber = 0;
			
		int PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber = 0;
		int PartialOrderTypeUnitTotalPartialValidOrderNumber = 0;
		int PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialValidOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialValidOrderNumber = 0;
		int PartialOrderTypeUnitMaxPartialValidOrderNumber = 0;
			
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialValidOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderCharNumber = 0;
			
		int OriginalOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int OriginalOrderTypeUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber = 0;
		int PartialOrderTypeLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderNumberLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber = 0;
		int PartialOrderCharNumberLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber = 0;
		
		do{//ValueToCharArrayEndMarker&0
			if(LoopTimeCountStartMarker <= 0){
				if(LoopTime == 0){
					ValueToCharArrayEndMarker = 1;
					MaxLoopTime = 2;
					PartialOrderTypeUnitMaxExponentialOrderCharNumber = 0;
					PartialOrderTypeUnitMaxDecimalOrderOrderCharNumber = 0;
					PartialOrderTypeUnitMaxCarryUpDigitOrderCharNumber = 0;
					PartialOrderTypeUnitMaxSuffixOrderCharNumber = 0;
					PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber = 0;
					PartialOrderTypeUnitMaxPrefixOrderCharNumber = 0;
					PartialOrderTypeUnitMaxDotOrderCharNumber = 0;
					PartialOrderTypeUnitMaxNullOrderCharNumber = 0;
					PartialOrderTypeUnitMaxWholeDigitOrderOrderCharNumber = 0;
				}//LoopTime&0
				if(MaxLoopTime >= 1){
					LoopTime = LoopTime + 1;
					LoopTimeModulo2Plus1 = LoopTimeModulo2Plus1 + 1;
				}//MaxLoopTime&1
				if(LoopTime == MaxLoopTime){
					LoopTimeEndMarker = 1;
				}//LoopTime&MaxLoopTime
				if(LoopTimeModulo2Plus1 == MaxLoopTimeModulo2Plus1){
					LoopTimeModulo2Plus1EndMarker = 1;
				}//LoopTimeModulo2Plus1&MaxLoopTimeModulo2Plus1
				
				OriginalOrderTypeUnitTotalOrderCharNumber = 0;
				OriginalOrderNumberUnitTotalOrderCharNumber = 0;
				TotalOrderCharNumber = 0;
				TotalOrderType = 0;
				TotalOrderNumber = 0;
				OriginalOrderNumberUnitTotalPartialOrderCharNumber = 0;
				OriginalOrderNumberUnitTotalPartialOrderNumber = 0;
				OriginalOrderNumberUnitTotalPartialValidOrderNumber = 0;
				OriginalOrderCharNumberUnitTotalPartialOrderCharNumber = 0;
				PartialOrderTypeUnitTotalPartialOrderCharNumber = 0;
				OriginalOrderTypeUnitTotalPartialOrderCharNumber = 0;
				
				PartialOrderTypeUnitTotalPartialOrderNumber = 0;
				PartialOrderTypeUnitTotalPartialValidOrderNumber = 0;
				
			}//LoopTimeCountStartMarker&0
			
			
			
			if(OrderTypeCountStartMarker <= 0){
				if(PartialOrderType == 0){
					if(PartialOrderTypeLoopTime == 0){
						if(OriginalOrderType == 0){
							LoopTimeCountStartMarker = 1;
							MaxOriginalOrderType = 0;
							TotalOriginalOrderType = 0;
							OriginalOrderTypeUnitMaxPartialOrderType = 0;
							
							TotalOriginalParameterArrayOrderType = 0;
							MaxOriginalParameterArrayOrderType = 0;
							
							if(MaxLoopTime >= 1){
								TotalOriginalParameterArrayOrderType = 0;
								MaxOriginalParameterArrayOrderType = MaxParameterApplicationTokenType;
								TotalOriginalOrderType = TotalOrderType;
								MaxOriginalOrderType = MaxValueApplicationOrderType;
							}//MaxLoopTime&1
							
							OriginalOrderTypeUnitMaxOrderNumber = 0;
							
							Value = Value0;
							RoundUpOneDigit = RoundUpOneDigit0;
							SetWholeDigitOrderOrderNumber = SetWholeDigitOrderOrderNumber0;
							SetDecimalOrderOrderNumber = SetDecimalOrderOrderNumber0;
							SetWholeDigitOrderOrderNumberMarker = SetWholeDigitOrderOrderNumberMarker0;
							SetDecimalOrderOrderNumberMarker = SetDecimalOrderOrderNumberMarker0;
							PlusOrMinusSignMarker = PlusOrMinusSignMarker0;
							DecimalOrderOrderNumber = DecimalOrderOrderNumber0;
							IntValueBase = IntValueBase0;
							LanguageKind = LanguageKind0;
							SuffixOrderNumber = 0;
							PrefixOrderNumber = 0;
							CarryUpDigitOrderNumber = 0;
							
							if(SetDecimalOrderOrderNumberMarker == 0){
								SuffixOrderNumber = 0;
							}else if(SetDecimalOrderOrderNumberMarker != 0){
								if(SetDecimalOrderOrderNumber <= 0){
									SuffixOrderNumber = 0;
								}else if(SetDecimalOrderOrderNumber >= 1){
									if(SetDecimalOrderOrderNumber <= DecimalOrderOrderNumber){
										SuffixOrderNumber = 0;
									}else if(SetDecimalOrderOrderNumber > DecimalOrderOrderNumber){
										if(DecimalOrderOrderNumber <= 0){
											SuffixOrderNumber = SetDecimalOrderOrderNumber;
										}else if(DecimalOrderOrderNumber >= 1){
											SuffixOrderNumber = SetDecimalOrderOrderNumber - DecimalOrderOrderNumber;
										}//DecimalOrderOrderNumber&0
									}//SetDecimalOrderOrderNumber & DecimalOrderOrderNumber
								}//SetDecimalOrderOrderNumber&1
							}//SetDecimalOrderOrderNumberMarker&0
							
							
							IntPlusOrMinusSign = 0;
							AbsoluteValue = 0.0;
							if(Value < 0.0){
								IntPlusOrMinusSign = -1;
								AbsoluteValue = -Value;
							}else if(Value > 0.0){
								IntPlusOrMinusSign = 1;
								AbsoluteValue = Value;
							}else{//Value
								IntPlusOrMinusSign = 0;
								AbsoluteValue = Value;
							}//Value&0.0
							
							
							IntValueBaseErrorMarker = 0;
							if(IntValueBase0 < 2){
								IntValueBaseErrorMarker = 1;
							}else if(IntValueBase0 >= 2){
								IntValueBaseErrorMarker = 0;
							}//IntValueBase0

							
							AbsoluteValueWholeDigitOrderPart = (double)((int)AbsoluteValue);
							AbsoluteValueDecimalOrderPart = AbsoluteValue - AbsoluteValueWholeDigitOrderPart;
							
							OriginalOrderTypeUnitMaxPartialOrderCharNumber = 0;
							
							PlusOrMinusSignStatus = UndefinedApplicationPlusOrMinusSignStatus;
							
							ValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
			 				ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
							RoundDownToZeroMarker = 0;
							WholeDigitOrderOrderNumber = 0;
							CarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker = 0;
							CarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 0;
							
						}//OriginalOrderType&0
						
						WholeOriginalOrderType = 0;
						
						if(MaxOriginalOrderType >= 1){
							OriginalOrderType = OriginalOrderType + 1;
							WholeOriginalOrderType = TotalOriginalOrderType + OriginalOrderType;
						}//MaxOriginalOrderType&1
						if(OriginalOrderType == MaxOriginalOrderType){
							OriginalOrderTypeEndMarker = 1;
						}//OriginalOrderType&MaxOriginalOrderType
						
						MaxPartialOrderTypeLoopTime = 0;
						
						if(MaxOriginalOrderType >= 1){
							MaxPartialOrderTypeLoopTime = 1;
						}//MaxOriginalOrderType&1
						
						PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber = OriginalOrderNumberUnitTotalPartialOrderNumber;
						PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber = OriginalOrderNumberUnitTotalPartialValidOrderNumber;
						PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber = OriginalOrderNumberUnitTotalPartialOrderCharNumber;
						PartialOrderTypeLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber = OriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
						PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderTypeUnitTotalPartialOrderCharNumber;
						
						PartialOrderTypeLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber = OriginalOrderTypeUnitTotalPartialOrderCharNumber;
						PartialOrderTypeLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber = OriginalOrderTypeUnitMaxPartialOrderCharNumber;
						
						PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber = PartialOrderTypeUnitTotalPartialOrderNumber;
						PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber = PartialOrderTypeUnitTotalPartialValidOrderNumber;
						
					}//PartialOrderTypeLoopTime&0
					
					MaxPartialOrderType = 0;
					MaxOriginalPartialOrderType = 0;
					
					if(MaxPartialOrderTypeLoopTime >= 1){
						PartialOrderTypeLoopTime = PartialOrderTypeLoopTime + 1;
					}//MaxPartialOrderTypeLoopTime&1
					if(PartialOrderTypeLoopTime == MaxPartialOrderTypeLoopTime){
						PartialOrderTypeLoopTimeEndMarker = 1;
					}//PartialOrderTypeLoopTime&MaxPartialOrderTypeLoopTime
					if(MaxPartialOrderTypeLoopTime >= 1){
						if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}else if(OriginalOrderType == SuffixValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}else if(OriginalOrderType == PrefixValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}else if(OriginalOrderType == DotValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}else if(OriginalOrderType == NullValueApplicationOrderType){
							MaxOriginalPartialOrderType = 1;
						}//OriginalOrderType
					}//MaxPartialOrderTypeLoopTime&1
					
					OriginalOrderNumberUnitTotalPartialOrderNumber = PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber;
					OriginalOrderNumberUnitTotalPartialValidOrderNumber = PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber;
					OriginalOrderNumberUnitTotalPartialOrderCharNumber = PartialOrderTypeLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber;
					OriginalOrderCharNumberUnitTotalPartialOrderCharNumber = PartialOrderTypeLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
					OriginalOrderCharNumberUnitMaxPartialOrderCharNumber = PartialOrderTypeLoopTimeRewindOriginalOrderCharNumberUnitMaxPartialOrderCharNumber;
					
					OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = 0;
					PartialOrderTypeCutTotalPartialOrderCharNumber = 0;
					
					PartialOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber;
					PartialOrderTypeUnitMaxPartialOrderCharNumber = 0;
					OriginalOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderTypeLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber;
					OriginalOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderTypeLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber;
					
					PartialOrderTypeUnitMaxPartialOrderNumber = 0;
					PartialOrderTypeUnitMaxPartialValidOrderNumber = 0;
					PartialOrderTypeUnitTotalPartialOrderNumber = PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber;
					PartialOrderTypeUnitTotalPartialValidOrderNumber = PartialOrderTypeLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber;
					
				}//PartialOrderType&0
				
				WholeOrderType = 0;
				OrderType = 0;
				PartialOrderTypeValidityDenialMarker = 0;
				
				
				if(MaxOriginalPartialOrderType >= 1){
					if(PartialOrderTypeValidityDenialMarker == 0){
						PartialOrderType = PartialOrderType + 1;
						OrderType = OriginalOrderTypeUnitMaxPartialOrderType + PartialOrderType;
						WholeOrderType = TotalOrderType + OrderType;
					}//PartialOrderTypeValidityDenialMarker&0
				}//MaxOriginalPartialOrderType&1
				if(PartialOrderTypeValidityDenialMarker == 0){
					if(PartialOrderType == MaxOriginalPartialOrderType){
						PartialOrderTypeEndMarker = 1;
					}//PartialOrderType&MaxOriginalPartialOrderType
				}else if(PartialOrderTypeValidityDenialMarker != 0){
					PartialOrderTypeEndMarker = 2;
				}//PartialOrderTypeValidityDenialMarker&0
				
				ParameterArrayOrderTypeUnitOutputDenialMarker = 0;
				OriginalParameterArrayOrderType = 0;
				
				if(MaxOriginalPartialOrderType >= 1){
					if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
						OriginalParameterArrayOrderType = DigitApplicationTokenType;
					}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
						OriginalParameterArrayOrderType = DigitApplicationTokenType;
					}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
						OriginalParameterArrayOrderType = CarryUpDigitApplicationTokenType;
					}else if(OriginalOrderType == SuffixValueApplicationOrderType){
						OriginalParameterArrayOrderType = SuffixDigitApplicationTokenType;
					}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
						if(PlusOrMinusSignStatus == UndefinedApplicationPlusOrMinusSignStatus){
							OriginalParameterArrayOrderType = UndefinedApplicationTokenType;
						}else if(PlusOrMinusSignStatus == MinusApplicationPlusOrMinusSignStatus){
							OriginalParameterArrayOrderType = MinusSignOperatorApplicationTokenType;
						}else if(PlusOrMinusSignStatus == PlusApplicationPlusOrMinusSignStatus){
							OriginalParameterArrayOrderType = PlusSignOperatorApplicationTokenType;
						}//PlusOrMinusSignStatus
					}else if(OriginalOrderType == PrefixValueApplicationOrderType){
						OriginalParameterArrayOrderType = PrefixDigitApplicationTokenType;
					}else if(OriginalOrderType == DotValueApplicationOrderType){
						OriginalParameterArrayOrderType = DotOperatorApplicationTokenType;
					}else if(OriginalOrderType == NullValueApplicationOrderType){
						OriginalParameterArrayOrderType = NullDigitApplicationTokenType;
					}//OriginalOrderType
				}//MaxOriginalPartialOrderType&1
				
				if(OriginalParameterArrayOrderType < 1){
					ParameterArrayOrderTypeUnitOutputDenialMarker = 1;
				}//OriginalParameterArrayOrderType&0
				if(OriginalParameterArrayOrderType > MaxOriginalParameterArrayOrderType){
					ParameterArrayOrderTypeUnitOutputDenialMarker = 2;
				}//OriginalParameterArrayOrderType&0
				if(MaxOriginalPartialOrderType <= 0){
					ParameterArrayOrderTypeUnitOutputDenialMarker = 3;
				}//MaxOriginalPartialOrderType&0
				
			}//OrderTypeCountStartMarker&0
			
			if(OrderNumberCountStartMarker <= 0){
				if(PartialOrderNumber == 0){
					if(PartialOrderNumberLoopTime == 0){
						if(OriginalOrderNumber == 0){
							OrderTypeCountStartMarker = 1;
							TotalOriginalParameterArrayOrderNumber = 0;
							MaxOriginalParameterArrayOrderNumber = 0;
							TotalOriginalOrderNumber = 0;
							OriginalOrderNumberUnitMaxOrderCharNumber = 0;
							MaxOriginalOrderNumber = 0;
							
							if(MaxOriginalPartialOrderType >= 1){
								TotalOriginalParameterArrayOrderNumber = 0;
								if(OriginalParameterArrayOrderType == FormatStringApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxFormatStringApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == ValueApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxValueApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == LeftBracketApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxLeftBracketApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == RightBracketApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxRightBracketApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == ArgumentStatementApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxArgumentStatementApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == DigitApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxNormalDigitApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == NullDigitApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxNullDigitApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == SuffixDigitApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxSuffixDigitApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == PrefixDigitApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxPrefixDigitApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == CarryUpDigitApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxCarryUpDigitApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == MinusSignOperatorApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxMinusSignOperatorApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == PlusSignOperatorApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxPlusSignOperatorApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == ExponentialOperatorApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxExponentialOperatorApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == DotOperatorApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxDotOperatorApplicationTokenStringNumber;
								}else if(OriginalParameterArrayOrderType == BlankApplicationTokenType){
									MaxOriginalParameterArrayOrderNumber = MaxBlankApplicationTokenStringNumber;
								}//OriginalParameterArrayOrderType
								
								if(PartialOrderTypeValidityDenialMarker == 0){
									TotalOriginalOrderNumber = TotalOrderNumber;
									if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}else if(OriginalOrderType == SuffixValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}else if(OriginalOrderType == PrefixValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}else if(OriginalOrderType == DotValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}else if(OriginalOrderType == NullValueApplicationOrderType){
										MaxOriginalOrderNumber = 1;
									}//OriginalOrderType
								}//PartialOrderTypeValidityDenialMarker&0
							}//MaxOriginalPartialOrderType&1
							
							
							OriginalOrderNumberUnitMaxPartialOrderNumber = 0;
							OriginalOrderNumberUnitMaxPartialValidOrderNumber = 0;
							OriginalOrderNumberUnitMaxPartialOrderCharNumber = 0;
							
						}//OriginalOrderNumber&0
						
						PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber = OriginalOrderNumberUnitTotalPartialOrderNumber;
						PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber = OriginalOrderNumberUnitTotalPartialValidOrderNumber;
						PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber = OriginalOrderNumberUnitTotalPartialOrderCharNumber;
						PartialOrderNumberLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber = OriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
						
						PartialOrderNumberLoopTimeRewindOriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber;
						PartialOrderNumberLoopTimeRewindPartialOrderTypeCutTotalPartialOrderCharNumber = PartialOrderTypeCutTotalPartialOrderCharNumber;
						
						PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderNumber = OriginalOrderNumberUnitMaxPartialOrderNumber;
						PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialValidOrderNumber = OriginalOrderNumberUnitMaxPartialValidOrderNumber;
						PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderCharNumber = OriginalOrderNumberUnitMaxPartialOrderCharNumber;
						
						PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderTypeUnitTotalPartialOrderCharNumber;
						PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						PartialOrderNumberLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber = OriginalOrderTypeUnitTotalPartialOrderCharNumber;
						PartialOrderNumberLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber = OriginalOrderTypeUnitMaxPartialOrderCharNumber;
						
						PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderNumber = PartialOrderTypeUnitMaxPartialOrderNumber;
						PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialValidOrderNumber = PartialOrderTypeUnitMaxPartialValidOrderNumber;
						PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber = PartialOrderTypeUnitTotalPartialOrderNumber;
						PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber = PartialOrderTypeUnitTotalPartialValidOrderNumber;
						
						
						
						WholeOriginalOrderNumber = 0;
						
						if(MaxOriginalOrderNumber >= 1){
							OriginalOrderNumber = OriginalOrderNumber + 1;
							WholeOriginalOrderNumber = TotalOriginalOrderNumber + OriginalOrderNumber;
						}//MaxOriginalOrderNumber&1
						if(OriginalOrderNumber == MaxOriginalOrderNumber){
							OriginalOrderNumberEndMarker = 1;
						}//OriginalOrderNumber&MaxOriginalOrderNumber
						
						MaxPartialOrderNumber = 0;
						MaxPartialOrderNumberLoopTime = 0;
						MaxOrderNumber = 0;
						
						MaxValidOrderNumber = 0;
						
						if(MaxOriginalOrderNumber >= 1){
							if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
								MaxPartialOrderNumberLoopTime = 2;
							}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
								MaxPartialOrderNumberLoopTime = 2;
							}else{//OriginalOrderType
								MaxPartialOrderNumberLoopTime = 1;
							}//OriginalOrderType
						}//MaxOriginalOrderNumber&1
						
					}//PartialOrderNumberLoopTime&0
					if(MaxPartialOrderNumberLoopTime >= 1){
						PartialOrderNumberLoopTime = PartialOrderNumberLoopTime + 1;
					}//MaxPartialOrderNumberLoopTime&1
					if(PartialOrderNumberLoopTime == MaxPartialOrderNumberLoopTime){
						PartialOrderNumberLoopTimeEndMarker = 1;
					}//PartialOrderNumberLoopTime&MaxPartialOrderNumberLoopTime
					
					MaxOriginalPartialOrderNumber = 0;
					
					if(MaxPartialOrderNumberLoopTime >= 1){
						if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}else if(OriginalOrderType == SuffixValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}else if(OriginalOrderType == PrefixValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}else if(OriginalOrderType == DotValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}else if(OriginalOrderType == NullValueApplicationOrderType){
							MaxOriginalPartialOrderNumber = 1;
						}//OriginalOrderType
					}//MaxPartialOrderNumberLoopTime&1
					
					if(MaxPartialOrderNumberLoopTime >= 1){
						if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
							DummyCarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker = 0;
							DummyAbsoluteValueDecimalOrderPart = AbsoluteValueDecimalOrderPart;
							DummyValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
					 		DummyValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
						}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							DummyRoundDownToZeroMarker = 0;

							DummyAbsoluteValueWholeDigitOrderPart = AbsoluteValueWholeDigitOrderPart;
							
							if(CarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker == 0){
								DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 0;
							}else{//CarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker
								DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = -1;
							}//CarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker&0

						}//OriginalOrderType
					}//MaxPartialOrderNumberLoopTime&1
					MaxPartialValidOrderNumber = 0;
					
					OriginalOrderNumberUnitTotalPartialOrderNumber = PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber;
					OriginalOrderNumberUnitTotalPartialValidOrderNumber = PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber;
					OriginalOrderNumberUnitTotalPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber;
					OriginalOrderNumberUnitMaxPartialValidOrderNumber = PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialValidOrderNumber;
					OriginalOrderNumberUnitMaxPartialOrderNumber = PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderNumber;
					OriginalOrderNumberUnitMaxPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderCharNumber;
					OriginalOrderCharNumberUnitTotalPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
					OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindOriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber;
					PartialOrderTypeCutTotalPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindPartialOrderTypeCutTotalPartialOrderCharNumber;
					
					PartialOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber;
					PartialOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderCharNumber;
					
					OriginalOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber;
					OriginalOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderNumberLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber;
					
					PartialOrderTypeUnitMaxPartialOrderNumber = PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderNumber;
					PartialOrderTypeUnitMaxPartialValidOrderNumber = PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialValidOrderNumber;
					PartialOrderTypeUnitTotalPartialOrderNumber = PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber;
					PartialOrderTypeUnitTotalPartialValidOrderNumber = PartialOrderNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber;
					
					
				}//PartialOrderNumber&0
				
				OrderNumber = 0;
				WholeOrderNumber = 0;
				MaxOrderCharNumber = 0;
				OriginalOrderNumberUnitWholePartialOrderNumber = 0;
				OriginalOrderNumberUnitWholePartialValidOrderNumber = 0;
				
				if(MaxOriginalPartialOrderNumber >= 1){
					
					PartialOrderNumber = PartialOrderNumber + 1;
					OrderNumber = OriginalOrderNumberUnitMaxPartialOrderNumber + PartialOrderNumber;
					WholeOrderNumber = TotalOrderNumber + OrderNumber;
					OriginalOrderNumberUnitWholePartialOrderNumber = OriginalOrderNumberUnitTotalPartialOrderNumber + OrderNumber;
				}//MaxOriginalPartialOrderNumber&1
				
				PartialOrderNumberValidityDenialMarker = 0;
				if(PartialOrderTypeValidityDenialMarker != 0){
					PartialOrderNumberValidityDenialMarker = -1;
				}//PartialOrderTypeValidityDenialMarker&0
				if(MaxOriginalPartialOrderNumber >= 1){
					if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
						if(SetDecimalOrderOrderNumberMarker != 0){
							if(PartialOrderNumber > SetDecimalOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 2;
							}//PartialOrderNumber&SetDecimalOrderOrderNumber
						}//SetDecimalOrderOrderNumberMarker&0
						if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(SetWholeDigitOrderOrderNumber <= -1){
								if(PartialOrderNumber < 1 - SetWholeDigitOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 3;
								}//PartialOrderNumber & 1 - SetWholeDigitOrderOrderNumber
							}//SetWholeDigitOrderOrderNumber
						}//SetWholeDigitOrderOrderNumberMarker&0
						
						if(DecimalOrderOrderNumber <= 0){
							PartialOrderNumberValidityDenialMarker = 4;
						}else if(DecimalOrderOrderNumber >= 1){
							if(PartialOrderNumber > DecimalOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 5;
							}//PartialOrderNumber&
						}//DecimalOrderOrderNumber&0
					}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
						if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(PartialOrderNumber > SetWholeDigitOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 6;
							}//PartialOrderNumber&ValueStringMaxWholeDigitOrderOrderNumber
						}//SetWholeDigitOrderOrderNumberMarker&0
						if(SetDecimalOrderOrderNumberMarker != 0){
							if(SetDecimalOrderOrderNumber <= -1){
								if(PartialOrderNumber < 1 - SetDecimalOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 7;
								}//PartialOrderNumber&ValueStringMinWholeDigitOrderOrderNumber
							}//SetDecimalOrderOrderNumber&-1
						}//SetDecimalOrderOrderNumberMarker&0
						if(PartialOrderNumberLoopTime >= 2){
							if(PartialOrderNumber > WholeDigitOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 8;
							}//PartialOrderNumber&
						}//PartialOrderNumberLoopTime&2
					}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
						if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(WholeDigitOrderOrderNumber + PartialOrderNumber > SetWholeDigitOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 9;
							}//WholeDigitOrderOrderNumber + PartialOrderNumber&ValueStringMaxWholeDigitOrderOrderNumber
						}//SetWholeDigitOrderOrderNumberMarker&0
						if(SetDecimalOrderOrderNumberMarker != 0){
							if(SetDecimalOrderOrderNumber <= -1){
								if(WholeDigitOrderOrderNumber + PartialOrderNumber < 1 - SetDecimalOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 10;
								}//WholeDigitOrderOrderNumber + PartialOrderNumber&ValueStringMinWholeDigitOrderOrderNumber
							}//SetDecimalOrderOrderNumber&-1
						}//SetDecimalOrderOrderNumberMarker&0
						if(CarryUpDigitOrderNumber == 0){
							PartialOrderNumberValidityDenialMarker = 11;
						}//CarryUpDigitOrderNumber&0
					}else if(OriginalOrderType == SuffixValueApplicationOrderType){
						if(SetDecimalOrderOrderNumberMarker != 0){
							if(DecimalOrderOrderNumber <= -1){
								if(PartialOrderNumber > SetDecimalOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 12;
								}//DecimalOrderOrderNumber + PartialOrderNumber&SetDecimalOrderOrderNumber
							}else if(DecimalOrderOrderNumber >= 0){
								if(DecimalOrderOrderNumber + PartialOrderNumber > SetDecimalOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 13;
								}//DecimalOrderOrderNumber + PartialOrderNumber&SetDecimalOrderOrderNumber
							}//DecimalOrderOrderNumber&0
						}//SetDecimalOrderOrderNumberMarker&0
						if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(SetWholeDigitOrderOrderNumber <= -1){
								if(DecimalOrderOrderNumber <= -1){
									if(PartialOrderNumber < 1 - SetWholeDigitOrderOrderNumber){
										PartialOrderNumberValidityDenialMarker = 14;
									}//PartialOrderNumber & 1 - SetWholeDigitOrderOrderNumber
								}else if(DecimalOrderOrderNumber >= 0){
									if(DecimalOrderOrderNumber + PartialOrderNumber < 1 - SetWholeDigitOrderOrderNumber){
										PartialOrderNumberValidityDenialMarker = 15;
									}//DecimalOrderOrderNumber + PartialOrderNumber & 1 - SetWholeDigitOrderOrderNumber
								}//DecimalOrderOrderNumber
							}//SetWholeDigitOrderOrderNumber
						}//SetWholeDigitOrderOrderNumberMarker&0
						if(SuffixOrderNumber == 0){
							PartialOrderNumberValidityDenialMarker = 16;
						}//SuffixOrderNumber&0
					}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
						if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber > SetWholeDigitOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 17;
							}//WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber&ValueStringMaxWholeDigitOrderOrderNumber
						}//SetWholeDigitOrderOrderNumberMarker&0
						if(SetDecimalOrderOrderNumberMarker != 0){
							if(SetDecimalOrderOrderNumber <= -1){
								if(WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber < 1 - SetDecimalOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 18;
								}//WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber&ValueStringMinWholeDigitOrderOrderNumber
							}//SetDecimalOrderOrderNumber&-1
						}//SetDecimalOrderOrderNumberMarker&0
					}else if(OriginalOrderType == PrefixValueApplicationOrderType){
						if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber + PartialOrderNumber > SetWholeDigitOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 19;
							}//WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber + PartialOrderNumber&ValueStringMaxWholeDigitOrderOrderNumber
						}//SetWholeDigitOrderOrderNumberMarker&0
						if(SetDecimalOrderOrderNumberMarker != 0){
							if(SetDecimalOrderOrderNumber <= -1){
								if(WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber + PartialOrderNumber < 1 - SetDecimalOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 20;
								}//WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber + PartialOrderNumber&ValueStringMinWholeDigitOrderOrderNumber
							}//SetDecimalOrderOrderNumber&-1
						}//SetDecimalOrderOrderNumberMarker&0
						if(PrefixOrderNumber == 0){
							PartialOrderNumberValidityDenialMarker = 21;
						}//PrefixOrderNumber&0
					}else if(OriginalOrderType == DotValueApplicationOrderType){
						if(SetDecimalOrderOrderNumberMarker == 0){
							if(DecimalOrderOrderNumber <= 0){
								PartialOrderNumberValidityDenialMarker = 22;
							}//DecimalOrderOrderNumber
						}else if(SetDecimalOrderOrderNumberMarker != 0){
							if(PartialOrderNumber > SetDecimalOrderOrderNumber){
								PartialOrderNumberValidityDenialMarker = 23;
							}//PartialOrderNumber&SetDecimalOrderOrderNumber
						}//SetDecimalOrderOrderNumberMarker&0
						if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(SetWholeDigitOrderOrderNumber <= -1){
								if(PartialOrderNumber < 1 - SetWholeDigitOrderOrderNumber){
									PartialOrderNumberValidityDenialMarker = 24;
								}//PartialOrderNumber & 1 - SetWholeDigitOrderOrderNumber
							}//SetWholeDigitOrderOrderNumber
						}//SetWholeDigitOrderOrderNumberMarker&0
					}else if(OriginalOrderType == NullValueApplicationOrderType){
						if(OriginalOrderNumberUnitTotalPartialOrderCharNumber >= 1){
							PartialOrderNumberValidityDenialMarker = 25;
						}//OriginalOrderNumberUnitTotalPartialOrderCharNumber&1
					}//OriginalOrderType
				}//MaxOriginalPartialOrderNumber&1
				
				if(MaxOriginalPartialOrderNumber >= 1){
					if(PartialOrderNumberValidityDenialMarker == 0){
						PartialValidOrderNumber = PartialValidOrderNumber + 1;
						ValidOrderNumber = OriginalOrderNumberUnitMaxPartialValidOrderNumber + PartialValidOrderNumber;
						OriginalOrderNumberUnitWholePartialValidOrderNumber = OriginalOrderNumberUnitTotalPartialValidOrderNumber + ValidOrderNumber;
					}//PartialOrderNumberValidityDenialMarker&0
				}//MaxOriginalPartialOrderNumber&1
				
				OriginalOneDigit = 0;
				OriginalCarryUpOneDigit = 0;
				OneDigit = 0;
				if(MaxOriginalPartialOrderNumber >= 1){
					if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
						if(IntValueBaseErrorMarker == 0){
							OriginalOneDigit = (int)(DummyAbsoluteValueDecimalOrderPart * (double)IntValueBase);
							DummyAbsoluteValueDecimalOrderPart = DummyAbsoluteValueDecimalOrderPart * (double)IntValueBase - (double)((int)(DummyAbsoluteValueDecimalOrderPart * (double)IntValueBase));
						}else if(IntValueBaseErrorMarker != 0){
							OriginalOneDigit = 0;
						}//IntValueBaseErrorMarker&0
					}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
						if(IntValueBaseErrorMarker == 0){
							OriginalOneDigit = (int)(DummyAbsoluteValueWholeDigitOrderPart - (double)IntValueBase * (double)((int)(DummyAbsoluteValueWholeDigitOrderPart/(double)IntValueBase)));
							DummyAbsoluteValueWholeDigitOrderPart = (double)((int)(DummyAbsoluteValueWholeDigitOrderPart/(double)IntValueBase));
						}else if(IntValueBaseErrorMarker != 0){
							OriginalOneDigit = 0;
						}//IntValueBaseErrorMarker&0
					}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
						OriginalOneDigit = 1;
					}//OriginalOrderType
				}//MaxOriginalPartialOrderNumber&1
				
				if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
					if(DecimalOrderOrderNumber <= -1){
						PartialOrderNumberEndMarker = 1;
					}else if(DecimalOrderOrderNumber >= 0){
						if(PartialOrderNumber == DecimalOrderOrderNumber + 1){
							PartialOrderNumberEndMarker = 2;
						}//PartialOrderNumber
					}//DecimalOrderOrderNumber
				}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
					if(IntValueBaseErrorMarker == 0){
						if(DummyAbsoluteValueWholeDigitOrderPart < 1.0){
							PartialOrderNumberEndMarker = 3;
						}//DummyAbsoluteValueWholeDigitOrderPart&1.0
					}else if(IntValueBaseErrorMarker != 0){
						PartialOrderNumberEndMarker = 4;
					}//IntValueBaseErrorMarker&0
				}else if(OriginalOrderType == SuffixValueApplicationOrderType){
					if(SuffixOrderNumber == 0){
						PartialOrderNumberEndMarker = -6;
					}else if(SuffixOrderNumber >= 1){
						if(PartialOrderNumber == SuffixOrderNumber){
							PartialOrderNumberEndMarker = 6;
						}//OrderNumber&SuffixOrderNumber
					}//SuffixOrderNumber
				}else if(OriginalOrderType == PrefixValueApplicationOrderType){
					if(PrefixOrderNumber == 0){
						PartialOrderNumberEndMarker = -6;
					}else if(PrefixOrderNumber >= 1){
						if(PartialOrderNumber == PrefixOrderNumber){
							PartialOrderNumberEndMarker = 8;
						}//OrderNumber&PrefixOrderNumber
					}//PartialOrderNumber
				}else{//OriginalOrderType
					PartialOrderNumberEndMarker = 9;
				}//OriginalOrderType
				
				if(MaxOriginalPartialOrderNumber >= 1){
			
					if(OriginalOrderType ==  DecimalOrderOrderNumberValueApplicationOrderType){
						CandidateCarryUpDecimalOrderMarker = 0;
						if(IntValueBaseErrorMarker == 0){
							if(PartialOrderNumber < DecimalOrderOrderNumber + 1){
								if(OriginalOneDigit >= IntValueBase - 1){
									CandidateCarryUpDecimalOrderMarker = 1;
								}//OriginalOneDigit
							}else if(PartialOrderNumber == DecimalOrderOrderNumber + 1){
								if(OriginalOneDigit >= RoundUpOneDigit){
									CandidateCarryUpDecimalOrderMarker = 2;
								}//OriginalOneDigit
							}//PartialOrderNumber&DecimalOrderOrderNumber
						}//IntValueBaseErrorMarker&0
						
						if(CandidateCarryUpDecimalOrderMarker == 0){
							if(DecimalOrderOrderNumber >= 0){
								DummyCarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker = 1;
							}//DecimalOrderOrderNumber&0
							DummyValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
							DummyValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber = 0;
						}else if(CandidateCarryUpDecimalOrderMarker != 0){
							DummyValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber = PartialOrderNumber;
							if(DummyValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber == 0){
								DummyValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber = PartialOrderNumber;
							}//DummyValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber&0
						}//CandidateCarryUpDecimalOrderMarker&0
						
						
						if(PartialOrderNumberLoopTime == 1){
							OneDigit = OriginalOneDigit;
						}else if(PartialOrderNumberLoopTime >= 2){
							if(RoundDownToZeroMarker == 0){
								if(IntValueBaseErrorMarker == 0){
									if(PartialOrderNumber <= DecimalOrderOrderNumber){
										if(ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber == 0){
											OneDigit = OriginalOneDigit;
										}else if(ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber >= 1){
											if(PartialOrderNumber >= ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber){
												OneDigit = 0;
											}else if(PartialOrderNumber == ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber - 1){
												if(OriginalOneDigit < OriginalCarryUpOneDigit){
													OneDigit = OriginalOneDigit;
												}else if(OriginalOneDigit >= OriginalCarryUpOneDigit){
													OneDigit = OriginalOneDigit + 1;
												}//OriginalOneDigit & OriginalCarryUpOneDigit&0
											}else if(PartialOrderNumber < ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber - 1){
												OneDigit = OriginalOneDigit;
											}//PartialOrderNumber
										}//ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber&1
									}else if(PartialOrderNumber > DecimalOrderOrderNumber){
										OneDigit = 0;
									}//PartialOrderNumber & DecimalOrderOrderNumber
								}else if(IntValueBaseErrorMarker != 0){
									OneDigit = 0;
								}//IntValueBaseErrorMarker&0
							}else if(RoundDownToZeroMarker != 0){
								OneDigit = 0;
							}//RoundDownToZeroMarker&0
						}//PartialOrderNumberLoopTime&2
					}else if(OriginalOrderType ==  WholeDigitOrderOrderNumberValueApplicationOrderType){
						if(IntValueBaseErrorMarker == 0){
							if(DecimalOrderOrderNumber <= -1){
								if(PartialOrderNumber < - DecimalOrderOrderNumber){
									OneDigit = 0;
									if(PartialOrderNumberEndMarker != 0){
										DummyRoundDownToZeroMarker = 1;
									}//PartialOrderNumberEndMarker&0
								}else if(PartialOrderNumber == - DecimalOrderOrderNumber){
									OneDigit = 0;
									if(OriginalOneDigit < RoundUpOneDigit){
										DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 2;
										if(PartialOrderNumberEndMarker != 0){
											DummyRoundDownToZeroMarker = 2;
										}//PartialOrderNumberEndMarker&0
									}//OriginalOneDigit
								}else if(PartialOrderNumber > - DecimalOrderOrderNumber){
									if(RoundDownToZeroMarker == 0){
										if(DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker == 0){
											if(OriginalOneDigit < IntValueBase - 1){
												OneDigit = OriginalOneDigit + 1;
											}else if(OriginalOneDigit == IntValueBase - 1){
												OneDigit = 0;
											}//OriginalOneDigit
										}else if(DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker != 0){
											OneDigit = OriginalOneDigit;
										}//DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker&0
									}else if(RoundDownToZeroMarker != 0){
										OneDigit = 0;
									}//RoundDownToZeroMarker&0
									if(OriginalOneDigit < IntValueBase - 1){
										DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 1;
									}//OriginalOneDigit
								}//PartialOrderNumber
							}else if(DecimalOrderOrderNumber >= 0){
								if(RoundDownToZeroMarker == 0){
									if(DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker == 0){
										if(OriginalOneDigit < IntValueBase - 1){
											OneDigit = OriginalOneDigit + 1;
										}else if(OriginalOneDigit == IntValueBase - 1){
											OneDigit = 0;
										}//OriginalOneDigit
									}else if(DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker != 0){
										OneDigit = OriginalOneDigit;
									}//DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker&0
								}else if(RoundDownToZeroMarker != 0){
									OneDigit = 0;
								}//RoundDownToZeroMarker&0
								if(OriginalOneDigit < IntValueBase - 1){
									DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 3;
								}//OriginalOneDigit
							}//DecimalOrderOrderNumber&0
						}else if(IntValueBaseErrorMarker != 0){
							OneDigit = 0;
							DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = 4;
						}//IntValueBaseErrorMarker
					}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
						OneDigit = OriginalOneDigit;
					}//OriginalOrderType
				}//MaxOriginalPartialOrderNumber&1
				
				OriginalParameterArrayOrderNumber = 0;
				
				if(MaxOriginalPartialOrderNumber >= 1){
					if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
						OriginalParameterArrayOrderNumber = OneDigit + 1;
					}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
						OriginalParameterArrayOrderNumber = OneDigit + 1;
					}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
						OriginalParameterArrayOrderNumber = CarryUpDigitApplicationTokenStringNumber;
					}else if(OriginalOrderType == SuffixValueApplicationOrderType){
						OriginalParameterArrayOrderNumber = SuffixDigitApplicationTokenStringNumber;
					}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
						if(PlusOrMinusSignStatus == UndefinedApplicationPlusOrMinusSignStatus){
							OriginalParameterArrayOrderNumber = UndefinedApplicationTokenStringNumber;
						}else if(PlusOrMinusSignStatus == MinusApplicationPlusOrMinusSignStatus){
							OriginalParameterArrayOrderNumber = MinusSignOperatorApplicationTokenStringNumber;
						}else if(PlusOrMinusSignStatus == PlusApplicationPlusOrMinusSignStatus){
							OriginalParameterArrayOrderNumber = PlusSignOperatorApplicationTokenStringNumber;
						}//PlusOrMinusSignStatus
					}else if(OriginalOrderType == PrefixValueApplicationOrderType){
						OriginalParameterArrayOrderNumber = PrefixDigitApplicationTokenStringNumber;
					}else if(OriginalOrderType == DotValueApplicationOrderType){
						OriginalParameterArrayOrderNumber = DotOperatorApplicationTokenStringNumber;
					}else if(OriginalOrderType == NullValueApplicationOrderType){
						OriginalParameterArrayOrderNumber = NullDigitApplicationTokenStringNumber;
					}//OriginalOrderType
				}//MaxOriginalPartialOrderNumber&1
				
				ParameterArrayOrderNumberUnitOutputDenialMarker = 0;
				if(ParameterArrayOrderTypeUnitOutputDenialMarker != 0){
					ParameterArrayOrderNumberUnitOutputDenialMarker = -1;
				}//ParameterArrayOrderTypeUnitOutputDenialMarker&0
				if(OriginalParameterArrayOrderNumber < 1){
					ParameterArrayOrderNumberUnitOutputDenialMarker = 1;
				}//OriginalParameterArrayOrderNumber&0
				if(OriginalParameterArrayOrderNumber > MaxOriginalParameterArrayOrderNumber){
					ParameterArrayOrderNumberUnitOutputDenialMarker = 2;
				}//OriginalParameterArrayOrderNumber&0
				if(MaxOriginalPartialOrderNumber <= 0){
					ParameterArrayOrderNumberUnitOutputDenialMarker = 3;
				}//MaxOriginalPartialOrderNumber&0
			}//OrderNumberCountStartMarker&0
			
			if(OrderCharNumberCountStartMarker <= 0){
				if(PartialOrderCharNumber == 0){
					if(PartialOrderCharNumberLoopTime == 0){
						if(OriginalOrderCharNumber == 0){
							
							OrderNumberCountStartMarker = 1;
							MaxOriginalOrderCharNumber = 0;
							TotalOriginalOrderCharNumber = 0;
							OriginalOrderCharNumberUnitMaxPartialOrderCharNumber = 0;
							TotalOriginalParameterArrayOrderCharNumber = 0;
							MaxOriginalParameterArrayOrderCharNumber = 0;
							
							if(MaxOriginalPartialOrderNumber >= 1){
								
								TotalOriginalParameterArrayOrderCharNumber = TotalOrderCharNumber;
								if(OriginalParameterArrayOrderType == FormatStringApplicationTokenType){
									if(OriginalParameterArrayOrderNumber == FormatStringApplicationTokenStringNumber){
										MaxOriginalParameterArrayOrderCharNumber = 0;
									}//OriginalParameterArrayOrderNumber
								}else if(OriginalParameterArrayOrderType == ValueApplicationTokenType){
									if(OriginalParameterArrayOrderNumber == ValueValueApplicationTokenStringNumber){
										if(StringValue != null){
											MaxOriginalParameterArrayOrderCharNumber = StringValue.length();
										}//StringValue&null
									}else if(OriginalParameterArrayOrderNumber == BaseValueApplicationTokenStringNumber){
										if(StringBase != null){
											MaxOriginalParameterArrayOrderCharNumber = StringBase.length();
										}//StringBase&null
									}else if(OriginalParameterArrayOrderNumber == PowerValueApplicationTokenStringNumber){
										if(StringPower != null){
											MaxOriginalParameterArrayOrderCharNumber = StringPower.length();
										}//StringPower&null
									}else if(OriginalParameterArrayOrderNumber == FValueApplicationTokenStringNumber){
										if(StringLowercaseF != null){
											MaxOriginalParameterArrayOrderCharNumber = StringLowercaseF.length();
										}//StringLowercaseF&null
									}else if(OriginalParameterArrayOrderNumber == DValueApplicationTokenStringNumber){
										if(StringLowercaseD != null){
											MaxOriginalParameterArrayOrderCharNumber = StringLowercaseD.length();
										}//StringLowercaseD&null
									}else if(OriginalParameterArrayOrderNumber == LfValueApplicationTokenStringNumber){
										if(StringLowercaseLF != null){
											MaxOriginalParameterArrayOrderCharNumber = StringLowercaseLF.length();
										}//StringLowercaseLF&null
									}//OriginalParameterArrayOrderNumber
								}else if(OriginalParameterArrayOrderType == LeftBracketApplicationTokenType){
									if(OriginalParameterArrayOrderNumber == RoundLeftBracketApplicationTokenStringNumber){
										if(StringRoundLeftBracket != null){
											MaxOriginalParameterArrayOrderCharNumber = StringRoundLeftBracket.length();
										}//StringRoundLeftBracket&null
									}//OriginalParameterArrayOrderNumber
								}else if(OriginalParameterArrayOrderType == RightBracketApplicationTokenType){
									if(OriginalParameterArrayOrderNumber == RoundRightBracketApplicationTokenStringNumber){
										if(StringRoundRightBracket != null){
											MaxOriginalParameterArrayOrderCharNumber = StringRoundRightBracket.length();
										}//StringRoundRightBracket&null
									}//OriginalParameterArrayOrderNumber
								}else if(OriginalParameterArrayOrderType == ArgumentStatementApplicationTokenType){
									if(OriginalParameterArrayOrderNumber == PercentageArgumentStatementApplicationTokenStringNumber){
										if(StringPercentage != null){
											MaxOriginalParameterArrayOrderCharNumber = StringPercentage.length();
										}//StringPercentage&null
									}//OriginalParameterArrayOrderNumber
								}else if(OriginalParameterArrayOrderType == DigitApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == ZeroNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageZeroNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageZeroNormalDigit.length();
											}//StringFirstApplicationLanguageZeroNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == OneNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageOneNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageOneNormalDigit.length();
											}//StringFirstApplicationLanguageOneNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == TwoNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageTwoNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageTwoNormalDigit.length();
											}//StringFirstApplicationLanguageTwoNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == ThreeNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageThreeNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageThreeNormalDigit.length();
											}//StringFirstApplicationLanguageThreeNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == FourNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageFourNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageFourNormalDigit.length();
											}//StringFirstApplicationLanguageFourNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == FiveNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageFiveNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageFiveNormalDigit.length();
											}//StringFirstApplicationLanguageFiveNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == SixNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageSixNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageSixNormalDigit.length();
											}//StringFirstApplicationLanguageSixNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == SevenNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageSevenNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageSevenNormalDigit.length();
											}//StringFirstApplicationLanguageSevenNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == EightNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageEightNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageEightNormalDigit.length();
											}//StringFirstApplicationLanguageEightNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == NineNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageNineNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageNineNormalDigit.length();
											}//StringFirstApplicationLanguageNineNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == ANormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageANormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageANormalDigit.length();
											}//StringFirstApplicationLanguageANormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == BNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageBNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageBNormalDigit.length();
											}//StringFirstApplicationLanguageBNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == CNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageCNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageCNormalDigit.length();
											}//StringFirstApplicationLanguageCNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == DNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageDNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageDNormalDigit.length();
											}//StringFirstApplicationLanguageDNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == ENormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageENormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageENormalDigit.length();
											}//StringFirstApplicationLanguageENormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == FNormalDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageFNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageFNormalDigit.length();
											}//StringFirstApplicationLanguageFNormalDigit&null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == ZeroNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageZeroNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageZeroNormalDigit.length();
											}//StringSecondApplicationLanguageZeroNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == OneNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageOneNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageOneNormalDigit.length();
											}//StringSecondApplicationLanguageOneNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == TwoNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageTwoNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageTwoNormalDigit.length();
											}//StringSecondApplicationLanguageTwoNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == ThreeNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageThreeNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageThreeNormalDigit.length();
											}//StringSecondApplicationLanguageThreeNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == FourNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageFourNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageFourNormalDigit.length();
											}//StringSecondApplicationLanguageFourNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == FiveNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageFiveNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageFiveNormalDigit.length();
											}//StringSecondApplicationLanguageFiveNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == SixNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageSixNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageSixNormalDigit.length();
											}//StringSecondApplicationLanguageSixNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == SevenNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageSevenNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageSevenNormalDigit.length();
											}//StringSecondApplicationLanguageSevenNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == EightNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageEightNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageEightNormalDigit.length();
											}//StringSecondApplicationLanguageEightNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == NineNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageNineNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageNineNormalDigit.length();
											}//StringSecondApplicationLanguageNineNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == ANormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageANormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageANormalDigit.length();
											}//StringSecondApplicationLanguageANormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == BNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageBNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageBNormalDigit.length();
											}//StringSecondApplicationLanguageBNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == CNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageCNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageCNormalDigit.length();
											}//StringSecondApplicationLanguageCNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == DNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageDNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageDNormalDigit.length();
											}//StringSecondApplicationLanguageDNormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == ENormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageENormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageENormalDigit.length();
											}//StringSecondApplicationLanguageENormalDigit&null
										}else if(OriginalParameterArrayOrderNumber == FNormalDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageFNormalDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageFNormalDigit.length();
											}//StringSecondApplicationLanguageFNormalDigit&null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == NullDigitApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == NullDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageNullDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageNullDigit.length();
											}//StringFirstApplicationLanguageNullDigit & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == NullDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageNullDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageNullDigit.length();
											}//StringSecondApplicationLanguageNullDigit & null
										}//OriginalParameterArrayOrderNumber
									}else{//LanguageKind
										if(OriginalParameterArrayOrderNumber == NullDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageNullDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageNullDigit.length();
											}//StringFirstApplicationLanguageNullDigit & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == SuffixDigitApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == SuffixDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageSuffixDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageSuffixDigit.length();
											}//StringFirstApplicationLanguageSuffixDigit & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == SuffixDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageSuffixDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageSuffixDigit.length();
											}//StringSecondApplicationLanguageSuffixDigit & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == PrefixDigitApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == PrefixDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguagePrefixDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguagePrefixDigit.length();
											}//StringFirstApplicationLanguagePrefixDigit & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == PrefixDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguagePrefixDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguagePrefixDigit.length();
											}//StringSecondApplicationLanguagePrefixDigit & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == CarryUpDigitApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == CarryUpDigitApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageCarryUpDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageCarryUpDigit.length();
											}//StringFirstApplicationLanguageCarryUpDigit & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == CarryUpDigitApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageCarryUpDigit != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageCarryUpDigit.length();
											}//StringSecondApplicationLanguageCarryUpDigit & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == MinusSignOperatorApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == MinusSignOperatorApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageMinusSignOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageMinusSignOperator.length();
											}//StringFirstApplicationLanguageMinusSignOperator & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == MinusSignOperatorApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageMinusSignOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageMinusSignOperator.length();
											}//StringSecondApplicationLanguageMinusSignOperator & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == PlusSignOperatorApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == PlusSignOperatorApplicationTokenStringNumber){
											if(StringFirstApplicationLanguagePlusSignOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguagePlusSignOperator.length();
											}//StringFirstApplicationLanguagePlusSignOperator & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == PlusSignOperatorApplicationTokenStringNumber){
											if(StringSecondApplicationLanguagePlusSignOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguagePlusSignOperator.length();
											}//StringSecondApplicationLanguagePlusSignOperator & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == ExponentialOperatorApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == ExponentialOperatorApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageExponentialOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageExponentialOperator.length();
											}//StringFirstApplicationLanguageExponentialOperator & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == ExponentialOperatorApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageExponentialOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageExponentialOperator.length();
											}//StringSecondApplicationLanguageExponentialOperator & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == DotOperatorApplicationTokenType){
									if(LanguageKind == FirstApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == DotOperatorApplicationTokenStringNumber){
											if(StringFirstApplicationLanguageDotOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringFirstApplicationLanguageDotOperator.length();
											}//StringFirstApplicationLanguageDotOperator & null
										}//OriginalParameterArrayOrderNumber
									}else if(LanguageKind == SecondApplicationLanguageKind){
										if(OriginalParameterArrayOrderNumber == DotOperatorApplicationTokenStringNumber){
											if(StringSecondApplicationLanguageDotOperator != null){
												MaxOriginalParameterArrayOrderCharNumber = StringSecondApplicationLanguageDotOperator.length();
											}//StringSecondApplicationLanguageDotOperator & null
										}//OriginalParameterArrayOrderNumber
									}//LanguageKind
								}else if(OriginalParameterArrayOrderType == BlankApplicationTokenType){
									if(OriginalParameterArrayOrderNumber == NullCharacterBlankApplicationTokenStringNumber){
										if(StringNullCharacterBlank != null){
											MaxOriginalParameterArrayOrderCharNumber = StringNullCharacterBlank.length();
										}//StringNullCharacterBlank & null
									}else if(OriginalParameterArrayOrderNumber == HorizontalTabBlankApplicationTokenStringNumber){
										if(StringHorizontalTabBlank != null){
											MaxOriginalParameterArrayOrderCharNumber = StringHorizontalTabBlank.length();
										}//StringHorizontalTabBlank & null
									}else if(OriginalParameterArrayOrderNumber == SpaceBlankApplicationTokenStringNumber){
										if(StringSpaceBlank != null){
											MaxOriginalParameterArrayOrderCharNumber = StringSpaceBlank.length();
										}//StringSpaceBlank & null
									}//OriginalParameterArrayOrderNumber
								}//OriginalParameterArrayOrderType
								
								if(PartialOrderNumberValidityDenialMarker == 0){
									MaxOriginalOrderCharNumber = MaxOriginalParameterArrayOrderCharNumber;
									TotalOriginalOrderCharNumber = TotalOrderCharNumber;
								}//PartialOrderNumberValidityDenialMarker&0
							}//MaxOriginalPartialOrderNumber&1
							
							OriginalOrderCharNumberCutTotalPartialOrderCharNumber = 0;
							
						}//OriginalOrderCharNumber&0
							
						WholeOriginalOrderCharNumber = 0;
					
						if(MaxOriginalOrderCharNumber >= 1){
							OriginalOrderCharNumber = OriginalOrderCharNumber + 1;
							WholeOriginalOrderCharNumber = TotalOriginalOrderCharNumber + OriginalOrderCharNumber;
						}//MaxOriginalOrderCharNumber&1
						if(OriginalOrderCharNumber == MaxOriginalOrderCharNumber){
							OriginalOrderCharNumberEndMarker = 1;
						}//OriginalOrderCharNumber&MaxOriginalOrderCharNumber
						
						MaxPartialOrderCharNumberLoopTime = 0;
						
						if(MaxOriginalOrderCharNumber >= 1){
							MaxPartialOrderCharNumberLoopTime = 1;
						}//MaxOriginalOrderCharNumber&1
						
						PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber = OriginalOrderNumberUnitTotalPartialOrderNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber = OriginalOrderNumberUnitTotalPartialValidOrderNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber = OriginalOrderNumberUnitTotalPartialOrderCharNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialValidOrderNumber = OriginalOrderNumberUnitMaxPartialValidOrderNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderNumber = OriginalOrderNumberUnitMaxPartialOrderNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderCharNumber = OriginalOrderNumberUnitMaxPartialOrderCharNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber = OriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
						
						PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber;
						PartialOrderCharNumberLoopTimeRewindPartialOrderTypeCutTotalPartialOrderCharNumber = PartialOrderTypeCutTotalPartialOrderCharNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberCutTotalPartialOrderCharNumber = OriginalOrderCharNumberCutTotalPartialOrderCharNumber;
						
						PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderTypeUnitTotalPartialOrderCharNumber;
						PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitMaxPartialOrderCharNumber = OriginalOrderCharNumberUnitMaxPartialOrderCharNumber;
						
						PartialOrderCharNumberLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber = OriginalOrderTypeUnitTotalPartialOrderCharNumber;
						PartialOrderCharNumberLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber = OriginalOrderTypeUnitMaxPartialOrderCharNumber;
						
						PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderNumber = PartialOrderTypeUnitMaxPartialOrderNumber;
						PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialValidOrderNumber = PartialOrderTypeUnitMaxPartialValidOrderNumber;
						PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber = PartialOrderTypeUnitTotalPartialOrderNumber;
						PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber = PartialOrderTypeUnitTotalPartialValidOrderNumber;
						
						
					}//PartialOrderCharNumberLoopTime&0
					
					if(MaxPartialOrderCharNumberLoopTime >= 1){
						PartialOrderCharNumberLoopTime = PartialOrderCharNumberLoopTime + 1;
					}//MaxPartialOrderCharNumberLoopTime&1
					if(PartialOrderCharNumberLoopTime == MaxPartialOrderCharNumberLoopTime){
						PartialOrderCharNumberLoopTimeEndMarker = 1;
					}//PartialOrderCharNumberLoopTime&MaxPartialOrderCharNumberLoopTime
					
					MaxPartialOrderCharNumber = 0;
					MaxOriginalPartialOrderCharNumber = 0;
					if(MaxPartialOrderCharNumberLoopTime >= 1){
						if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}else if(OriginalOrderType == SuffixValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}else if(OriginalOrderType == PrefixValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}else if(OriginalOrderType == DotValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}else if(OriginalOrderType == NullValueApplicationOrderType){
							MaxOriginalPartialOrderCharNumber = 1;
						}//OriginalOrderType
					}//MaxPartialOrderCharNumberLoopTime&1
					
					OriginalOrderNumberUnitTotalPartialOrderNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderNumber;
					OriginalOrderNumberUnitTotalPartialValidOrderNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialValidOrderNumber;
					OriginalOrderNumberUnitTotalPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitTotalPartialOrderCharNumber;
					OriginalOrderNumberUnitMaxPartialValidOrderNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialValidOrderNumber;
					OriginalOrderNumberUnitMaxPartialOrderNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderNumber;
					OriginalOrderNumberUnitMaxPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderNumberUnitMaxPartialOrderCharNumber;
					OriginalOrderCharNumberUnitTotalPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
					
					OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber;
					PartialOrderTypeCutTotalPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindPartialOrderTypeCutTotalPartialOrderCharNumber;
					OriginalOrderCharNumberCutTotalPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberCutTotalPartialOrderCharNumber;
					
					PartialOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderCharNumber;
					PartialOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderCharNumber;
					OriginalOrderCharNumberUnitMaxPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderCharNumberUnitMaxPartialOrderCharNumber;
					
					OriginalOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderTypeUnitTotalPartialOrderCharNumber;
					OriginalOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderCharNumberLoopTimeRewindOriginalOrderTypeUnitMaxPartialOrderCharNumber;
					
					PartialOrderTypeUnitMaxPartialOrderNumber = PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialOrderNumber;
					PartialOrderTypeUnitMaxPartialValidOrderNumber = PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitMaxPartialValidOrderNumber;
					PartialOrderTypeUnitTotalPartialOrderNumber = PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialOrderNumber;
					PartialOrderTypeUnitTotalPartialValidOrderNumber = PartialOrderCharNumberLoopTimeRewindPartialOrderTypeUnitTotalPartialValidOrderNumber;
					
					
				}//PartialOrderCharNumber&0
				
				OriginalOrderNumberUnitOrderCharNumber = 0;
				OriginalOrderNumberUnitSubstitutingOrderCharNumber = 0;
				OrderCharNumber = 0;
				WholeOrderCharNumber = 0;
				OriginalOrderNumberUnitWholePartialOrderCharNumber = 0;
				OriginalOrderCharNumberUnitWholePartialOrderCharNumber = 0;
				OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = 0;
				OriginalOrderTypeCutOriginalOrderCharNumberUnitWholePartialOrderCharNumber = 0;
				if(MaxOriginalPartialOrderCharNumber >= 1){
					PartialOrderCharNumber = PartialOrderCharNumber + 1;
					OrderCharNumber = OriginalOrderCharNumberUnitMaxPartialOrderCharNumber + PartialOrderCharNumber;
					WholeOrderCharNumber = TotalOrderCharNumber + OrderCharNumber;
					OriginalOrderNumberUnitOrderCharNumber = OriginalOrderNumberUnitMaxPartialOrderCharNumber + PartialOrderCharNumber;
					OriginalOrderNumberUnitWholePartialOrderCharNumber = OriginalOrderNumberUnitTotalPartialOrderCharNumber + OriginalOrderNumberUnitOrderCharNumber;
					OriginalOrderCharNumberUnitWholePartialOrderCharNumber = OriginalOrderCharNumberUnitTotalPartialOrderCharNumber + PartialOrderCharNumber;
					OriginalOrderTypeCutOriginalOrderCharNumberUnitWholePartialOrderCharNumber = PartialOrderTypeCutTotalPartialOrderCharNumber + PartialOrderCharNumber;
					OriginalOrderCharNumberUnitPartialOrderCharNumber = OriginalOrderCharNumberUnitMaxPartialOrderCharNumber + PartialOrderCharNumber;
					
					if(PartialOrderNumberLoopTimeEndMarker != 0){
						if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							OriginalOrderNumberUnitSubstitutingOrderCharNumber = PartialOrderTypeUnitMaxWholeDigitOrderOrderCharNumber - (OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber + MaxOriginalPartialOrderCharNumber * MaxOriginalOrderCharNumber) + OriginalOrderCharNumberUnitPartialOrderCharNumber;
						}else{//OriginalOrderType
							OriginalOrderNumberUnitSubstitutingOrderCharNumber = OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber + OriginalOrderCharNumberUnitPartialOrderCharNumber;
						}//OriginalOrderType
						if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber + PartialOrderTypeUnitMaxPrefixOrderCharNumber + PartialOrderTypeUnitMaxCarryUpDigitOrderCharNumber + PartialOrderTypeUnitMaxWholeDigitOrderOrderCharNumber + PartialOrderTypeUnitMaxDotOrderCharNumber + OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber + PartialOrderTypeUnitMaxPrefixOrderCharNumber + PartialOrderTypeUnitMaxCarryUpDigitOrderCharNumber + OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber + PartialOrderTypeUnitMaxPrefixOrderCharNumber + OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}else if(OriginalOrderType == SuffixValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber + PartialOrderTypeUnitMaxPrefixOrderCharNumber + PartialOrderTypeUnitMaxCarryUpDigitOrderCharNumber + PartialOrderTypeUnitMaxWholeDigitOrderOrderCharNumber + PartialOrderTypeUnitMaxDotOrderCharNumber + PartialOrderTypeUnitMaxDecimalOrderOrderCharNumber + OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}else if(OriginalOrderType == PrefixValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber + OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}else if(OriginalOrderType == DotValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber + PartialOrderTypeUnitMaxPrefixOrderCharNumber + PartialOrderTypeUnitMaxCarryUpDigitOrderCharNumber + PartialOrderTypeUnitMaxWholeDigitOrderOrderCharNumber + OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}else if(OriginalOrderType == NullValueApplicationOrderType){
							OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber = OriginalOrderNumberUnitSubstitutingOrderCharNumber;
						}//OriginalOrderType
					}//PartialOrderNumberLoopTimeEndMarker&0
				}//MaxOriginalPartialOrderCharNumber&1
				
				if(PartialOrderCharNumber == MaxOriginalPartialOrderCharNumber){
					PartialOrderCharNumberEndMarker = 1;
				}//PartialOrderCharNumber&MaxOriginalPartialOrderCharNumber
				
				OriginalParameterArrayOrderCharNumber = 0;
				ParameterArrayOrderCharNumberUnitOutputDenialMarker = 0;
				
				if(MaxOriginalPartialOrderCharNumber >= 1){
					OriginalParameterArrayOrderCharNumber = OriginalOrderCharNumber;
				}//MaxOriginalPartialOrderCharNumber&1
				
				if(ParameterArrayOrderNumberUnitOutputDenialMarker != 0){
					ParameterArrayOrderCharNumberUnitOutputDenialMarker = -1;
				}//ParameterArrayOrderNumberUnitOutputDenialMarker&0
				if(OriginalParameterArrayOrderCharNumber < 1){
					ParameterArrayOrderCharNumberUnitOutputDenialMarker = 1;
				}//OriginalParameterArrayOrderCharNumber&0
				if(OriginalParameterArrayOrderCharNumber > MaxOriginalParameterArrayOrderCharNumber){
					ParameterArrayOrderCharNumberUnitOutputDenialMarker = 2;
				}//OriginalParameterArrayOrderCharNumber&0
				if(MaxOriginalPartialOrderCharNumber <= 0){
					ParameterArrayOrderCharNumberUnitOutputDenialMarker = 3;
				}//MaxOriginalPartialOrderCharNumber&0
				PartialOrderCharNumberValidityDenialMarker = 0;
				if(PartialOrderNumberValidityDenialMarker != 0){
					PartialOrderCharNumberValidityDenialMarker = -1;
				}//PartialOrderNumberValidityDenialMarker&0
				
			}//OrderCharNumberCountStartMarker&0
			
			OriginalParameterArrayOrderOneChar = (char)0;
			OriginalOneChar = (char)0;
			OneChar = (char)0;
			ParameterArrayOrderOneCharUnitOutputDenialMarker = 0;
			if(ParameterArrayOrderCharNumberUnitOutputDenialMarker != 0){
				ParameterArrayOrderOneCharUnitOutputDenialMarker = -1;
			}//ParameterArrayOrderCharNumberUnitOutputDenialMarker&0
			if(MaxOriginalOrderCharNumber <= 0){
				ParameterArrayOrderOneCharUnitOutputDenialMarker = 1;
			}//MaxOriginalOrderCharNumber&0
			
			if(ParameterArrayOrderOneCharUnitOutputDenialMarker == 0){
				if(OriginalParameterArrayOrderType == FormatStringApplicationTokenType){
					if(OriginalParameterArrayOrderNumber == FormatStringApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = 0;
					}//OriginalParameterArrayOrderNumber
				}else if(OriginalParameterArrayOrderType == ValueApplicationTokenType){
					if(OriginalParameterArrayOrderNumber == ValueValueApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringValue.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}else if(OriginalParameterArrayOrderNumber == BaseValueApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringBase.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}else if(OriginalParameterArrayOrderNumber == PowerValueApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringPower.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}else if(OriginalParameterArrayOrderNumber == FValueApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringLowercaseF.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}else if(OriginalParameterArrayOrderNumber == DValueApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringLowercaseD.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}else if(OriginalParameterArrayOrderNumber == LfValueApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringLowercaseLF.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}//OriginalParameterArrayOrderNumber
				}else if(OriginalParameterArrayOrderType == LeftBracketApplicationTokenType){
					if(OriginalParameterArrayOrderNumber == RoundLeftBracketApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringRoundLeftBracket.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}//OriginalParameterArrayOrderNumber
				}else if(OriginalParameterArrayOrderType == RightBracketApplicationTokenType){
					if(OriginalParameterArrayOrderNumber == RoundRightBracketApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringRoundRightBracket.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}//OriginalParameterArrayOrderNumber
				}else if(OriginalParameterArrayOrderType == ArgumentStatementApplicationTokenType){
					if(OriginalParameterArrayOrderNumber == PercentageArgumentStatementApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringPercentage.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}//OriginalParameterArrayOrderNumber
				}else if(OriginalParameterArrayOrderType == DigitApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == ZeroNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageZeroNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == OneNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageOneNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == TwoNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageTwoNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == ThreeNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageThreeNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == FourNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageFourNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == FiveNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageFiveNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == SixNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageSixNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == SevenNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageSevenNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == EightNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageEightNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == NineNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageNineNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == ANormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageANormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == BNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageBNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == CNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageCNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == DNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageDNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == ENormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageENormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == FNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageFNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == ZeroNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageZeroNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == OneNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageOneNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == TwoNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageTwoNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == ThreeNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageThreeNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == FourNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageFourNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == FiveNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageFiveNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == SixNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageSixNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == SevenNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageSevenNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == EightNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageEightNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == NineNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageNineNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == ANormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageANormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == BNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageBNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == CNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageCNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == DNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageDNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == ENormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageENormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}else if(OriginalParameterArrayOrderNumber == FNormalDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageFNormalDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == NullDigitApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == NullDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageNullDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == NullDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageNullDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else{//LanguageKind
						if(OriginalParameterArrayOrderNumber == NullDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageNullDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == SuffixDigitApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == SuffixDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageSuffixDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == SuffixDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageSuffixDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == PrefixDigitApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == PrefixDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguagePrefixDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == PrefixDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguagePrefixDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == CarryUpDigitApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == CarryUpDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageCarryUpDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == CarryUpDigitApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageCarryUpDigit.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == MinusSignOperatorApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == MinusSignOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageMinusSignOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == MinusSignOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageMinusSignOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == PlusSignOperatorApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == PlusSignOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguagePlusSignOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == PlusSignOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguagePlusSignOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == ExponentialOperatorApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == ExponentialOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageExponentialOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == ExponentialOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageExponentialOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == DotOperatorApplicationTokenType){
					if(LanguageKind == FirstApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == DotOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringFirstApplicationLanguageDotOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}else if(LanguageKind == SecondApplicationLanguageKind){
						if(OriginalParameterArrayOrderNumber == DotOperatorApplicationTokenStringNumber){
							OriginalParameterArrayOrderOneChar = StringSecondApplicationLanguageDotOperator.charAt(OriginalParameterArrayOrderCharNumber - 1);
						}//OriginalParameterArrayOrderNumber
					}//LanguageKind
				}else if(OriginalParameterArrayOrderType == BlankApplicationTokenType){
					if(OriginalParameterArrayOrderNumber == NullCharacterBlankApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringNullCharacterBlank.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}else if(OriginalParameterArrayOrderNumber == HorizontalTabBlankApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringHorizontalTabBlank.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}else if(OriginalParameterArrayOrderNumber == SpaceBlankApplicationTokenStringNumber){
						OriginalParameterArrayOrderOneChar = StringSpaceBlank.charAt(OriginalParameterArrayOrderCharNumber - 1);
					}//OriginalParameterArrayOrderNumber
				}//OriginalParameterArrayOrderType
			}//ParameterArrayOrderOneCharUnitOutputDenialMarker&0
			if(MaxOriginalOrderCharNumber >= 1){
				if(PartialOrderCharNumberValidityDenialMarker == 0){
					OriginalOneChar = OriginalParameterArrayOrderOneChar;
				}//PartialOrderCharNumberValidityDenialMarker&0
			}//MaxOriginalOrderCharNumber&1
			
			if(MaxOriginalPartialOrderCharNumber >= 1){
				if(PartialOrderNumberLoopTimeEndMarker != 0){
					if(LoopTime == 2){
						CharDoubleValue[OriginalOrderNumberUnitWholeSubstitutingPartialOrderCharNumber - 1] = OriginalParameterArrayOrderOneChar;
					}//LoopTime
				}//PartialOrderNumberLoopTimeEndMarker&0
			}//MaxOriginalPartialOrderCharNumber&1
			
			
			if(OrderCharNumberCountStartMarker <= 0){
				if(PartialOrderCharNumberEndMarker != 0){
					MaxPartialOrderCharNumber = PartialOrderCharNumber;
					
					PartialOrderTypeCutTotalPartialOrderCharNumber = PartialOrderTypeCutTotalPartialOrderCharNumber + MaxPartialOrderCharNumber;
					OriginalOrderNumberUnitMaxPartialOrderCharNumber = OriginalOrderNumberUnitMaxPartialOrderCharNumber + MaxPartialOrderCharNumber;
					OriginalOrderCharNumberUnitMaxPartialOrderCharNumber = OriginalOrderCharNumberUnitMaxPartialOrderCharNumber + MaxPartialOrderCharNumber;
					PartialOrderTypeUnitMaxPartialOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber + MaxPartialOrderCharNumber;
					
					OriginalOrderCharNumberCutTotalPartialOrderCharNumber = OriginalOrderCharNumberCutTotalPartialOrderCharNumber + MaxPartialOrderCharNumber;
					
					if(PartialOrderCharNumberLoopTimeEndMarker != 0){
						if(OriginalOrderCharNumberEndMarker != 0){
							MaxOrderCharNumber = OriginalOrderNumberUnitMaxPartialOrderCharNumber;
							
							
							
							if(PartialOrderNumberLoopTimeEndMarker != 0){
								if(MaxOriginalPartialOrderNumber >= 1){
									if(LoopTime == 2){
										OriginalOrderCharNumberUnitMaxPartialOrderCharNumbers[OriginalOrderNumberUnitWholePartialOrderNumber - 1] = OriginalOrderCharNumberUnitMaxPartialOrderCharNumber;
										OriginalOrderCharNumberUnitTotalPartialOrderCharNumbers[OriginalOrderNumberUnitWholePartialOrderNumber - 1] = OriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
										PartialOrderTypeCutTotalPartialOrderCharNumbers[OriginalOrderNumberUnitWholePartialOrderNumber - 1] = PartialOrderTypeCutTotalPartialOrderCharNumber;
										OriginalOrderCharNumberUnitWholePartialOrderNumbers[OriginalOrderNumberUnitWholePartialOrderNumber - 1] = OriginalOrderNumberUnitWholePartialOrderNumber;
									}//LoopTime
									if(PartialOrderNumberValidityDenialMarker == 0){
										if(LoopTime == 2){
											OriginalValidOrderCharNumberUnitMaxPartialOrderCharNumbers[OriginalOrderNumberUnitWholePartialValidOrderNumber - 1] = OriginalOrderCharNumberUnitMaxPartialOrderCharNumber;
											OriginalValidOrderCharNumberUnitTotalPartialOrderCharNumbers[OriginalOrderNumberUnitWholePartialValidOrderNumber - 1] = OriginalOrderCharNumberUnitTotalPartialOrderCharNumber;
											OriginalValidOrderCharNumberUnitWholePartialOrderNumbers[OriginalOrderNumberUnitWholePartialValidOrderNumber - 1] = OriginalOrderNumberUnitWholePartialOrderNumber;
										}//LoopTime
									}//PartialOrderNumberValidityDenialMarker&0
								}//MaxOriginalPartialOrderNumber&1
							}//PartialOrderNumberLoopTimeEndMarker&0
							
							OriginalOrderCharNumberUnitTotalPartialOrderCharNumber = OriginalOrderCharNumberUnitTotalPartialOrderCharNumber + OriginalOrderCharNumberUnitMaxPartialOrderCharNumber;
							OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber = OriginalOrderCharNumberUnitPartialOrderTypeCutTotalPartialOrderCharNumber + OriginalOrderCharNumberUnitMaxPartialOrderCharNumber;
							
							OrderNumberCountStartMarker = -1;
							OriginalOrderCharNumber = 0;
							OriginalOrderCharNumberEndMarker = 0;
						}//OriginalOrderCharNumberEndMarker&0
						PartialOrderCharNumberLoopTime = 0;
						PartialOrderCharNumberLoopTimeEndMarker = 0;
					}//PartialOrderCharNumberLoopTimeEndMarker&0
					PartialOrderCharNumber = 0;
					PartialOrderCharNumberEndMarker = 0;
					
				}//PartialOrderCharNumberEndMarker&0
			}//OrderCharNumberCountStartMarker&0
			
			if(OrderNumberCountStartMarker <= 0){
				
				if(PartialOrderNumberEndMarker != 0){
					MaxPartialOrderNumber = PartialOrderNumber;
					OriginalOrderNumberUnitMaxPartialOrderNumber = OriginalOrderNumberUnitMaxPartialOrderNumber + MaxPartialOrderNumber;
					MaxOrderNumber = OriginalOrderNumberUnitMaxPartialOrderNumber;
					MaxPartialValidOrderNumber = PartialValidOrderNumber;
					OriginalOrderNumberUnitMaxPartialValidOrderNumber = OriginalOrderNumberUnitMaxPartialValidOrderNumber + MaxPartialValidOrderNumber;
					MaxValidOrderNumber = OriginalOrderNumberUnitMaxPartialValidOrderNumber;
					
					if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
						if(MaxOriginalOrderNumber >= 1){
							ValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber = DummyValueSubStringSmallestRoundUpOrderNumberDecimalOrderOrderNumber;
							ValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber = DummyValueSubStringLargestRoundUpOrderNumberDecimalOrderOrderNumber;
						}//MaxOriginalOrderNumber&1
					}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
						
						if(MaxOriginalOrderNumber >= 1){
							
							RoundDownToZeroMarker = DummyRoundDownToZeroMarker;
							
							if(RoundDownToZeroMarker == 0){
								if(DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker == 0){
									CarryUpDigitOrderNumber = 1;
								}//DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker&0
							}//RoundDownToZeroMarker&0
							
							if(RoundDownToZeroMarker == 0){
								WholeDigitOrderOrderNumber = MaxPartialOrderNumber;
							}else if(RoundDownToZeroMarker != 0){
								WholeDigitOrderOrderNumber = 1;
							}//RoundDownToZeroMarker&0
							
						}//MaxOriginalOrderNumber&1
					}//OriginalOrderType
					
					if(PartialOrderNumberLoopTimeEndMarker != 0){
						
						if(OriginalOrderNumberEndMarker != 0){
							
							if(MaxOriginalPartialOrderNumber >= 1){
								if(LoopTime == 2){
									OriginalOrderNumberUnitTotalPartialOrderCharNumbers[WholeOrderType - 1] = OriginalOrderNumberUnitTotalPartialOrderCharNumber;
									OriginalOrderNumberUnitMaxPartialOrderCharNumbers[WholeOrderType - 1] = OriginalOrderNumberUnitMaxPartialOrderCharNumber;
									OriginalOrderNumberUnitTotalPartialOrderNumbers[WholeOrderType - 1] = OriginalOrderNumberUnitTotalPartialOrderNumber;
									OriginalOrderNumberUnitMaxPartialOrderNumbers[WholeOrderType - 1] = OriginalOrderNumberUnitMaxPartialOrderNumber;
									OriginalOrderNumberUnitTotalPartialValidOrderNumbers[WholeOrderType - 1] = OriginalOrderNumberUnitTotalPartialValidOrderNumber;
									OriginalOrderNumberUnitMaxPartialValidOrderNumbers[WholeOrderType - 1] = OriginalOrderNumberUnitMaxPartialValidOrderNumber;
								}//LoopTime
							}//MaxOriginalPartialOrderNumber&1
							
							OriginalOrderNumberUnitTotalPartialOrderNumber = OriginalOrderNumberUnitTotalPartialOrderNumber + OriginalOrderNumberUnitMaxPartialOrderNumber;
							OriginalOrderNumberUnitTotalPartialValidOrderNumber = OriginalOrderNumberUnitTotalPartialValidOrderNumber + OriginalOrderNumberUnitMaxPartialValidOrderNumber;
							OriginalOrderNumberUnitTotalPartialOrderCharNumber = OriginalOrderNumberUnitTotalPartialOrderCharNumber + OriginalOrderNumberUnitMaxPartialOrderCharNumber;
							
							OrderTypeCountStartMarker = -1;
							
							OriginalOrderNumber = 0;
							OriginalOrderNumberEndMarker = 0;
						}//OriginalOrderNumberEndMarker&0
						PartialOrderNumberLoopTime = 0;
						PartialOrderNumberLoopTimeEndMarker = 0;
					}//PartialOrderNumberLoopTimeEndMarker&0
					PartialValidOrderNumber = 0;
					PartialOrderNumber = 0;
					PartialOrderNumberEndMarker = 0;
				}//PartialOrderNumberEndMarker&0
			}//OrderNumberCountStartMarker&0
			
			if(OrderTypeCountStartMarker <= 0){
				if(PartialOrderTypeEndMarker != 0){
					MaxPartialOrderType = PartialOrderType;
					OriginalOrderTypeUnitMaxPartialOrderType = OriginalOrderTypeUnitMaxPartialOrderType + MaxPartialOrderType;
					
					PartialOrderTypeUnitTotalPartialOrderCharNumber = PartialOrderTypeUnitTotalPartialOrderCharNumber + PartialOrderTypeUnitMaxPartialOrderCharNumber;
					
					if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
						if(SetWholeDigitOrderOrderNumberMarker == 0){
							PrefixOrderNumber = 0;
						}else if(SetWholeDigitOrderOrderNumberMarker != 0){
							if(SetWholeDigitOrderOrderNumber <= 0){
								PrefixOrderNumber = 0;
							}else if(SetWholeDigitOrderOrderNumber >= 1){
								if(SetWholeDigitOrderOrderNumber <= WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber){
									PrefixOrderNumber = 0;
								}else if(SetWholeDigitOrderOrderNumber > WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber){
									if(WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber <= 0){
										PrefixOrderNumber = SetWholeDigitOrderOrderNumber;
									}else if(WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber >= 1){
										PrefixOrderNumber = SetWholeDigitOrderOrderNumber - (WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber);
									}//WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber&0
								}//SetWholeDigitOrderOrderNumber & WholeDigitOrderOrderNumber + CarryUpDigitOrderNumber
							}//SetWholeDigitOrderOrderNumber&1
						}//SetWholeDigitOrderOrderNumberMarker&0
					}//OriginalOrderType
					
					if(PartialOrderTypeLoopTimeEndMarker != 0){
						
						if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							PlusOrMinusSignStatus = UndefinedApplicationPlusOrMinusSignStatus;
							if(PlusOrMinusSignMarker == 0){
								if(RoundDownToZeroMarker == 0){
									if(IntPlusOrMinusSign <= -1){
										PlusOrMinusSignStatus = MinusApplicationPlusOrMinusSignStatus;
									}else if(IntPlusOrMinusSign >= 0){
										PlusOrMinusSignStatus = UndefinedApplicationPlusOrMinusSignStatus;
									}//IntPlusOrMinusSign&0
								}else if(RoundDownToZeroMarker != 0){
									PlusOrMinusSignStatus = UndefinedApplicationPlusOrMinusSignStatus;
								}//RoundDownToZeroMarker
							}else if(PlusOrMinusSignMarker != 0){
								if(RoundDownToZeroMarker == 0){
									if(IntPlusOrMinusSign <= -1){
										PlusOrMinusSignStatus = MinusApplicationPlusOrMinusSignStatus;
									}else if(IntPlusOrMinusSign >= 0){
										PlusOrMinusSignStatus = PlusApplicationPlusOrMinusSignStatus;
									}//IntPlusOrMinusSign
								}else if(RoundDownToZeroMarker != 0){
									PlusOrMinusSignStatus = PlusApplicationPlusOrMinusSignStatus;
								}//RoundDownToZeroMarker&0
							}//PlusOrMinusSignMarker
						}//OriginalOrderType
						
						if(OriginalOrderType == DecimalOrderOrderNumberValueApplicationOrderType){
							PartialOrderTypeUnitMaxDecimalOrderOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
							CarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker = DummyCarryUpDigitDecimalOrderOrderNumberDiscontinuityMarker;
						}else if(OriginalOrderType == WholeDigitOrderOrderNumberValueApplicationOrderType){
							PartialOrderTypeUnitMaxWholeDigitOrderOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
							CarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker = DummyCarryUpDigitWholeDigitOrderOrderNumberDiscontinuityMarker;
						}else if(OriginalOrderType == CarryUpDigitValueApplicationOrderType){
							PartialOrderTypeUnitMaxCarryUpDigitOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						}else if(OriginalOrderType == SuffixValueApplicationOrderType){
							PartialOrderTypeUnitMaxSuffixOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						}else if(OriginalOrderType == PlusOrMinusSignValueApplicationOrderType){
							PartialOrderTypeUnitMaxPlusOrMinusSignOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						}else if(OriginalOrderType == PrefixValueApplicationOrderType){
							PartialOrderTypeUnitMaxPrefixOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						}else if(OriginalOrderType == DotValueApplicationOrderType){
							PartialOrderTypeUnitMaxDotOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						}else if(OriginalOrderType == NullValueApplicationOrderType){
							PartialOrderTypeUnitMaxNullOrderCharNumber = PartialOrderTypeUnitMaxPartialOrderCharNumber;
						}//OriginalOrderType
						
						if(OriginalOrderTypeEndMarker != 0){
							MaxOrderType = OriginalOrderTypeUnitMaxPartialOrderType;
							
							TotalOrderType = TotalOrderType + MaxOrderType;
							LoopTimeCountStartMarker = -1;
							OriginalOrderType = 0;
							OriginalOrderTypeEndMarker = 0;
						}//OriginalOrderTypeEndMarker&0
						PartialOrderTypeLoopTime = 0;
						PartialOrderTypeLoopTimeEndMarker = 0;
					}//PartialOrderTypeLoopTimeEndMarker&0
					
					PartialOrderType = 0;
					PartialOrderTypeEndMarker = 0;
					
				}//PartialOrderTypeEndMarker&0
			}//OrderTypeCountStartMarker&0
			
			if(LoopTimeCountStartMarker <= 0){
				
				
				if(LoopTime == 1){
					if(OriginalOrderNumberUnitTotalPartialOrderCharNumbers != null){
						OriginalOrderNumberUnitTotalPartialOrderCharNumbers = null;
					}//OriginalOrderNumberUnitTotalPartialOrderCharNumbers&null
					if(OriginalOrderNumberUnitMaxPartialOrderCharNumbers != null){
						OriginalOrderNumberUnitMaxPartialOrderCharNumbers = null;
					}//OriginalOrderNumberUnitMaxPartialOrderCharNumbers&null
					if(OriginalOrderNumberUnitTotalPartialOrderNumbers != null){
						OriginalOrderNumberUnitTotalPartialOrderNumbers = null;
					}//OriginalOrderNumberUnitTotalPartialOrderNumbers&null
					if(OriginalOrderNumberUnitMaxPartialOrderNumbers != null){
						OriginalOrderNumberUnitMaxPartialOrderNumbers = null;
					}//OriginalOrderNumberUnitMaxPartialOrderNumbers&null
					if(OriginalOrderNumberUnitTotalPartialValidOrderNumbers != null){
						OriginalOrderNumberUnitTotalPartialValidOrderNumbers = null;
					}//OriginalOrderNumberUnitTotalPartialValidOrderNumbers&null
					if(OriginalOrderNumberUnitMaxPartialValidOrderNumbers != null){
						OriginalOrderNumberUnitMaxPartialValidOrderNumbers = null;
					}//OriginalOrderNumberUnitMaxPartialValidOrderNumbers&null
					if(TotalOrderType >= 1){
						OriginalOrderNumberUnitTotalPartialOrderCharNumbers = new int[TotalOrderType];
						OriginalOrderNumberUnitMaxPartialOrderCharNumbers = new int[TotalOrderType];
						OriginalOrderNumberUnitTotalPartialOrderNumbers = new int[TotalOrderType];
						OriginalOrderNumberUnitMaxPartialOrderNumbers = new int[TotalOrderType];
						OriginalOrderNumberUnitTotalPartialValidOrderNumbers = new int[TotalOrderType];
						OriginalOrderNumberUnitMaxPartialValidOrderNumbers = new int[TotalOrderType];
					}//TotalOrderType&1
					
					if(OriginalOrderCharNumberUnitMaxPartialOrderCharNumbers != null){
						OriginalOrderCharNumberUnitMaxPartialOrderCharNumbers = null;
					}//OriginalOrderCharNumberUnitMaxPartialOrderCharNumbers&null
					if(OriginalOrderCharNumberUnitTotalPartialOrderCharNumbers != null){
						OriginalOrderCharNumberUnitTotalPartialOrderCharNumbers = null;
					}//OriginalOrderCharNumberUnitTotalPartialOrderCharNumbers&null
					if(PartialOrderTypeCutTotalPartialOrderCharNumbers != null){
						PartialOrderTypeCutTotalPartialOrderCharNumbers = null;
					}//PartialOrderTypeCutTotalPartialOrderCharNumbers&null
					if(OriginalOrderCharNumberUnitWholePartialOrderNumbers != null){
						OriginalOrderCharNumberUnitWholePartialOrderNumbers = null;
					}//OriginalOrderCharNumberUnitWholePartialOrderNumbers&null
					if(OriginalOrderNumberUnitTotalPartialOrderNumber >= 1){
						OriginalOrderCharNumberUnitMaxPartialOrderCharNumbers = new int[OriginalOrderNumberUnitTotalPartialOrderNumber];
						OriginalOrderCharNumberUnitTotalPartialOrderCharNumbers = new int[OriginalOrderNumberUnitTotalPartialOrderNumber];
						PartialOrderTypeCutTotalPartialOrderCharNumbers = new int[OriginalOrderNumberUnitTotalPartialOrderNumber];
						OriginalOrderCharNumberUnitWholePartialOrderNumbers = new int[OriginalOrderNumberUnitTotalPartialOrderNumber];
					}//OriginalOrderNumberUnitTotalPartialOrderNumber&1
					
					if(OriginalValidOrderCharNumberUnitMaxPartialOrderCharNumbers != null){
						OriginalValidOrderCharNumberUnitMaxPartialOrderCharNumbers = null;
					}//OriginalValidOrderCharNumberUnitMaxPartialOrderCharNumbers&null
					if(OriginalValidOrderCharNumberUnitTotalPartialOrderCharNumbers != null){
						OriginalValidOrderCharNumberUnitTotalPartialOrderCharNumbers = null;
					}//OriginalValidOrderCharNumberUnitTotalPartialOrderCharNumbers&null
					if(OriginalValidOrderCharNumberUnitWholePartialOrderNumbers != null){
						OriginalValidOrderCharNumberUnitWholePartialOrderNumbers = null;
					}//OriginalValidOrderCharNumberUnitWholePartialOrderNumbers&null
					if(OriginalOrderNumberUnitTotalPartialValidOrderNumber >= 1){
						OriginalValidOrderCharNumberUnitMaxPartialOrderCharNumbers = new int[OriginalOrderNumberUnitTotalPartialValidOrderNumber];
						OriginalValidOrderCharNumberUnitTotalPartialOrderCharNumbers = new int[OriginalOrderNumberUnitTotalPartialValidOrderNumber];
						OriginalValidOrderCharNumberUnitWholePartialOrderNumbers = new int[OriginalOrderNumberUnitTotalPartialValidOrderNumber];
					}//OriginalOrderNumberUnitTotalPartialValidOrderNumber&1
					
					if(CharDoubleValue != null){
						CharDoubleValue = null;
					}//CharDoubleValue&null
					if(OriginalOrderNumberUnitTotalPartialOrderCharNumber >= 1){
						CharDoubleValue = new char[OriginalOrderNumberUnitTotalPartialOrderCharNumber];
					}//OriginalOrderNumberUnitTotalPartialOrderCharNumber&1
				}//LoopTime
				if(LoopTimeModulo2Plus1EndMarker != 0){
					LoopTimeModulo2Plus1 = 0;
					LoopTimeModulo2Plus1EndMarker = 0;
				}//LoopTimeModulo2Plus1EndMarker&0
				if(LoopTimeEndMarker != 0){
					ValueToCharArrayEndMarker = -1;
					LoopTime = 0;
					LoopTimeEndMarker = 0;
					
					LoopTimeModulo2Plus1 = 0;
					LoopTimeModulo2Plus1EndMarker = 0;
				}//LoopTimeEndMarker
			}//LoopTimeCountStartMarker&0
			
		}while(ValueToCharArrayEndMarker >= 1);
			
		return(CharDoubleValue);
	}//ValueToCharArray
}//CafeValueToCharArray6