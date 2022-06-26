public class PosterManager {
    protected String[] poster = new String[0];
    protected int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        limit = 10;
    }

    public void add(String film) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = film;
        poster = tmp;
    }

    public String[] findAll() {
        return poster;

    }

    public String[] findLast() {
        int resultLenght;
        if (poster.length < limit) {
            resultLenght = poster.length;
        } else {
            resultLenght = limit;
        }
        String[] ans = new String[resultLenght];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = poster[poster.length - 1 - i];
        }
        return ans;
    }
}
