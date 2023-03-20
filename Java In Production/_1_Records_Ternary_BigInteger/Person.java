package _1_Records_Ternary_BigInteger;

public record Person (String name, int age, String address) {
    @Override
    public String toString() {
        return "The person is " +name +", aged " +age +", and lives in " +address;
    }
}
