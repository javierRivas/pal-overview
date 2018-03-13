public Class Order {
  private final Buyer buyer;
  private final Seller seller;
  private final Long price;

  public Order(Buyer buyer, Seller seller, Long price) {
    this.buyer = buyer;
    this.seller = seller;
    this.price = price;
  }

  public Buyer getBuyer() {
    return buyer;
  }

  public Seller getSeller() {
    return seller;
  }

  public Long getPrice() {
    return price;
  }

  public boolean equals(Order o) {
    ...
  }

  public int hashCode(Order o) {
    ...
  }

  public toString() {
    ...
  }
}
