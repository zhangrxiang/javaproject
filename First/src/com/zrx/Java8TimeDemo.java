package com.zrx;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by zhang on 2015/9/5.
 */
public class Java8TimeDemo {
    @Test
    public void testFormat() {
        LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();
        int value = month.getValue();
        System.out.println(value);
        LocalDateTime localDateTime = localDate.atStartOfDay();
        String s = localDateTime.toString();
        System.out.println(s);
        String format = localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        format=localDateTime.format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println(format);

    }

    @Test
    public void test() {
        Clock clock2 = Clock.systemDefaultZone();
        System.out.print(clock2.instant());
        Clock clock = new Clock() {
            @Override
            public ZoneId getZone() {
                return null;
            }

            @Override
            public Clock withZone(ZoneId zone) {
                return null;
            }

            @Override
            public Instant instant() {
                return null;
            }
        };
    }

}
