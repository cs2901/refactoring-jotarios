boolean isSummer() {
  return date.after(SUMMER_START) && date.before(SUMMER_END);
}

if (isSummer()) {
  charge = quantity * summerRate;
}
else {
  charge = quantity * winterRate + winterServiceCharge;
}