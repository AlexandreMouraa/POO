//Years in a city

class Arge
{
    public static int nbYear(int p0, double percent, int aug, int p)
    {
        //p0 it's the current number of inhabitants
        //percent is the increase of population per year
        //aug is the new inhabitants per year who come to live in the town
        //p is the expected time to reach this number

        int time = 0;

        while(p0 < p)
        {
            double rev = (p0 * (percent/100));
            p0 += (rev + aug);
            time++;
        }
        return time;
    }
}