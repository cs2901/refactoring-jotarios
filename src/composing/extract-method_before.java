void printName() {
    System.out.println("name: " + name);
}

void printAmount() {
    System.out.println("amount: " + getOutstanding());
}

void printDetails() {
    printName();
    printAmount();
}

void printOwing() {
  printBanner();
  printDetails();
}
