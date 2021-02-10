package com.epam.jdi.light.elements.complex.table;

import com.epam.jdi.tools.DataClass;

import java.util.List;

import static com.epam.jdi.tools.LinqUtils.firstIndex;
import static com.epam.jdi.tools.StringUtils.format;
import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static com.epam.jdi.tools.PrintUtils.print;

/**
 * Created by Roman Iovlev on 26.09.2019
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */
public class NameNum extends DataClass<NameNum> {
    public int num = 0;
    public String name;

    public boolean hasName() {
        return isNotBlank(name);
    }
    @Override
    public String toString() {
        if (!hasName() && num > 0)
            return num + "";
        if (hasName() && num == 0)
            return name;
        if (hasName() && num > 0)
            return format("%s (%s)", name, num);
        return "";
    }
    public int getIndex(List<String> headers) {
        logger.debug("Find header with ");
        int result = !hasName() ? num  : firstIndex(headers,
                h -> equalsIgnoreCase(h, name))+1;
        logger.debug("Find header with name = '%s' in headers [%s]. Found as %d",
                name, print(headers, ", "), result);
        return result;
    }
}