package drawing.book;

public class DrawingBook {

    public static int pageCount(int size, int desiredPage) {
        int minimumStepsTop = 0;
        int minimumStepsBottom = 0;

        for (int page = 0; page < size; page+=2) {

            if (desiredPage == 1){
                return minimumStepsTop;
            }

            if (page == desiredPage || page + 1 == desiredPage){
                break;
            }

            minimumStepsTop++;
        }

        for (int page = size; page > 1; page-=2) {

            if (page == desiredPage || page - 1 == desiredPage){
                break;
            }

            minimumStepsBottom++;
        }

        return Math.min(minimumStepsTop, minimumStepsBottom);
    }
}
