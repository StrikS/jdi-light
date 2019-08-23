package io.github.com.custom;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.interfaces.complex.IsCombobox;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.epam.jdi.light.ui.html.elements.complex.Dropdown;
import io.github.com.entities.Contacts;

import java.lang.reflect.Field;

public class ContactFormCustomFill extends Form<Contacts> {
    TextField name;
    TextField lastName, position, passportNumber, passportSeria;

    Dropdown gender;
    IsCombobox religion;

    Checkbox passport, acceptConditions;
    TextArea description;

    @UI("['Submit']") public Button submit;

    @Override
    public void fillAction(Field field, Object element, Object parent, String setValue) {
        String value = setValue;
        if (field.getName().equals("name"))
            value = setValue.toUpperCase();
        super.fillAction(field, element, parent, value);
    }
}
