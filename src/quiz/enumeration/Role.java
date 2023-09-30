package quiz.enumeration;

public enum Role {
    ADMIN("관리자", 10),
    NORMAL("일반 회원", 0),
    VIP("VIP", 20);

    private final String displayName;
    private final int discountRate;

    Role(String displayName, int discountRate) {
        this.displayName = displayName;
        this.discountRate = discountRate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
