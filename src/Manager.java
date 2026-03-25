public class Manager extends Approver {
    @Override
    public boolean approve(BorrowRequest request) {
        if (request.getDays() <= 14) {
            System.out.println("Manager approved the request.");
            return true;
        } else if (next != null) {
            return next.approve(request);
        }
        return false;
    }
}
