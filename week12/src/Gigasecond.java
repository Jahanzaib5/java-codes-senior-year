import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime birthTime;

    public Gigasecond(LocalDateTime localDateTime){
        this.birthTime=localDateTime;
    }

    public Gigasecond(LocalDate localDate){
        this.birthTime = localDate.atStartOfDay();
    }

    public LocalDateTime getDateTime(){
        long gigaSeconds = 1000000000;
        return birthTime.plusSeconds(gigaSeconds);
    }

}
