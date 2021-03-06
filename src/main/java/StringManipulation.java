class StringManipulation {

  /**
   * Reverses the end of a string.
   *
   *                          012345                     012345
   * For example: reverseEnd("Hello, world", 5) returns "Hellodlrow ,"
   *                               <----->                    <----->
   *
   * With start == 0, reverses the entire text.
   * With start == text.length(), reverses nothing.
   *
   * @param text    non-null String that will have its end reversed
   * @param start   the index at which the remainder of the input is reversed,
   *                requires 0 <= start <= text.length()
   * @return input text with the substring from start to the end of the string reversed
   */
  public static String reverseEnd(String text, int start) {

    String original = new String("");
    for(int i = 0; i < start; i++){
      original += text.charAt(i);
    }
    for(int i = text.length() - 1; i > start - 1; i--){
      original += text.charAt(i);
    }

    return original;
  }

}
