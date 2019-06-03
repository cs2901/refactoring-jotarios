void renderBanner() {
  String MAC = "MAC";
  String IE = "IE";
  final boolean containsMac = platform.toUpperCase().indexOf(MAC) > -1;
  final boolean containsIE = browser.toUpperCase().indexOf(IE) > -1;
  final boolean resizeIsPositive = resize > 0;
  final boolean query = containsMac && containsIE && wasInitialized() && resizeIsPositive:

  if (query) {
    // do something
  }
}