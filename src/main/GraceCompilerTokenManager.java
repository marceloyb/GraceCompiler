/* Generated By:JavaCC: Do not edit this line. GraceCompilerTokenManager.java */

/** Token Manager. */
public class GraceCompilerTokenManager implements GraceCompilerConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x4000800000L) != 0L)
            return 0;
         if ((active0 & 0x40000000000L) != 0L)
         {
            jjmatchedKind = 11;
            return 4;
         }
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 11;
            return 22;
         }
         if ((active0 & 0x4e80000000060L) != 0L)
         {
            jjmatchedKind = 11;
            return 32;
         }
         if ((active0 & 0x3000000000000L) != 0L)
         {
            jjmatchedKind = 11;
            return 14;
         }
         return -1;
      case 1:
         if ((active0 & 0x2000000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 1;
            return 13;
         }
         if ((active0 & 0x5f80000000060L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 1;
            return 32;
         }
         if ((active0 & 0x40000000000L) != 0L)
            return 32;
         return -1;
      case 2:
         if ((active0 & 0x7e80000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 2;
            return 32;
         }
         if ((active0 & 0x100000000060L) != 0L)
            return 32;
         return -1;
      case 3:
         if ((active0 & 0x3480000000000L) != 0L)
            return 32;
         if ((active0 & 0x4a00000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 3;
            return 32;
         }
         return -1;
      case 4:
         if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 4;
            return 32;
         }
         if ((active0 & 0xa00000000000L) != 0L)
            return 32;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 37:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 40:
         return jjStopAtPos(0, 12);
      case 41:
         return jjStopAtPos(0, 13);
      case 42:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 43:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 44:
         return jjStopAtPos(0, 18);
      case 45:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 47:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 58:
         return jjStopAtPos(0, 41);
      case 59:
         return jjStopAtPos(0, 19);
      case 60:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 61:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 62:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 63:
         return jjStopAtPos(0, 40);
      case 91:
         return jjStopAtPos(0, 16);
      case 93:
         return jjStopAtPos(0, 17);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x4400000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x3000000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0xa00000000000L);
      case 123:
         return jjStopAtPos(0, 14);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 125:
         return jjStopAtPos(0, 15);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 61:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4400000000020L);
      case 102:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 42, 32);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000000L);
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000L);
      case 124:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      case 102:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 32);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1a00000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000000L);
      case 114:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 32);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 32);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 32);
         break;
      case 101:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 43, 32);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      case 112:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 48, 32);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 49, 32);
         break;
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 45, 32);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 32);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 50, 32);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 32;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 22:
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAdd(24);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 0:
                  if (curChar != 47)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAdd(1);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(24);
                  break;
               case 25:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 27:
                  if (curChar == 32)
                     jjCheckNAddStates(0, 2);
                  break;
               case 28:
                  if (curChar == 34 && kind > 10)
                     kind = 10;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 22:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddTwoStates(30, 31);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 32:
               case 31:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddTwoStates(30, 31);
                  }
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                     jjCheckNAddTwoStates(30, 31);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 22;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddTwoStates(30, 31);
                  }
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddTwoStates(30, 31);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 1:
                  if (kind > 4)
                     kind = 4;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 116 && kind > 7)
                     kind = 7;
                  break;
               case 5:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 108 && kind > 7)
                     kind = 7;
                  break;
               case 7:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 103 && kind > 7)
                     kind = 7;
                  break;
               case 11:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 15:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 101 && kind > 8)
                     kind = 8;
                  break;
               case 17:
                  if (curChar == 117)
                     jjCheckNAdd(16);
                  break;
               case 18:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 115)
                     jjCheckNAdd(16);
                  break;
               case 21:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 23:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 27:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjAddStates(0, 2);
                  break;
               case 29:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 32 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   26, 27, 28, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\144\145\146", "\166\141\162", null, null, null, 
null, null, "\50", "\51", "\173", "\175", "\133", "\135", "\54", "\73", "\53", 
"\55", "\52", "\57", "\45", "\75\75", "\41\75", "\76", "\74", "\76\75", "\74\75", 
"\174\174", "\46\46", "\41", "\75", "\53\75", "\55\75", "\52\75", "\57\75", "\45\75", 
"\77", "\72", "\151\146", "\145\154\163\145", "\146\157\162", "\167\150\151\154\145", 
"\162\145\141\144", "\167\162\151\164\145", "\163\153\151\160", "\163\164\157\160", 
"\162\145\164\165\162\156", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[32];
static private final int[] jjstateSet = new int[64];
static protected char curChar;
/** Constructor. */
public GraceCompilerTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public GraceCompilerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 32; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}