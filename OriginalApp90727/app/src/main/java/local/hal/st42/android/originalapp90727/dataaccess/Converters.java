package local.hal.st42.android.originalapp90727.dataaccess;

import androidx.room.TypeConverter;

import java.time.LocalDate;
import java.util.Date;

public class Converters{
    @TypeConverter
    public static Date fromTimestamp(Long value){
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date){
        return date == null ? null : date.getTime();
    }
}
