package com.epam.jdi.light.elements.init;

import com.epam.jdi.light.elements.common.uiElement;
import com.epam.jdi.light.elements.complex.Selector;
import com.epam.jdi.light.elements.complex.webList;
import com.epam.jdi.light.elements.complex.table.DataTable;
import com.epam.jdi.light.elements.complex.table.Table;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.interfaces.complex.IsDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.MarkupLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Roman Iovlev on 03.28.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */
public class UIFactory {
    @Deprecated
    public static uiElement element(@MarkupLocator String locator) {
        return JDITalk.element(locator);
    }
    @Deprecated
    public static uiElement element(@MarkupLocator By byLocator) {
        return JDITalk.element(byLocator);
    }
    public static uiElement $(@MarkupLocator String locator) {
        return JDITalk.element(locator);
    }
    public static uiElement $(@MarkupLocator String locator, Object parent) {
        return JDITalk.element(locator).setup(j->j.setParent(parent));
    }
    public static uiElement $(@MarkupLocator By locator) {
        return JDITalk.element(locator);
    }
    public static uiElement $(WebElement webElement) {
        return new uiElement(webElement);
    }
    public static uiElement $(@MarkupLocator By locator, Object parent) {
        return JDITalk.element(locator).setup(j->j.setParent(parent));
    }
    @Deprecated
    public static webList list(@MarkupLocator String locator) {
        return JDITalk.list(locator);
    }
    @Deprecated
    public static webList list(@MarkupLocator By byLocator) {
        return JDITalk.list(byLocator);
    }
    @Deprecated
    public static webList list(List<WebElement> els, String name) {
        return JDITalk.list(els, name);
    }
    public static webList $$(@MarkupLocator String locator) {
        return JDITalk.list(locator);
    }
    public static webList $$(@MarkupLocator String locator, Object parent) {
        return JDITalk.list(locator).setup(j->j.setParent(parent));
    }
    public static webList $$(@MarkupLocator By locator) {
        return JDITalk.list(locator);
    }
    public static webList $$(@MarkupLocator By locator, Object parent) {
        return JDITalk.list(locator).setup(j->j.setParent(parent));
    }
    public static webList $$(List<WebElement> els, String name) {
        return JDITalk.list(els, name);
    }

    @Deprecated
    public static Selector selector(@MarkupLocator String locator) {
        return JDITalk.selector(locator);
    }
    @Deprecated
    public static IsDropdown dropdown(@MarkupLocator String locator) {
        return JDITalk.dropdown(locator);
    }
    @Deprecated
    public static IsDropdown dropdown(String root, String value, String list, String expand) {
        return JDITalk.dropdown(root, value, list, expand);
    }
    @Deprecated
    public static <T> Form<T> form(Class<T> entityClass) {
        return JDITalk.form(entityClass);
    }
    @Deprecated
    public static <T> Form<T> form(@MarkupLocator String locator, Class<T> entityClass) {
        return JDITalk.form(locator, entityClass);
    }
    @Deprecated
    public static <T> void submitForm(T entity) {
        JDITalk.submitForm(entity);
    }
    @Deprecated
    public static <T> void submitForm(@MarkupLocator String locator, T entity) {
        JDITalk.submitForm(locator, entity);
    }
    @Deprecated
    public static <T> void loginAs(T entity) {
        JDITalk.loginAs(entity);
    }
    @Deprecated
    public static <T> void loginAs(@MarkupLocator String locator, T entity) {
        JDITalk.loginAs(locator, entity);
    }
    @Deprecated
    public static Table table(@MarkupLocator String locator) {
        return JDITalk.table(locator);
    }
    @Deprecated
    public static <D> DataTable<?, D> dataTable(@MarkupLocator String locator) {
        return JDITalk.dataTable(locator);
    }
    @Deprecated
    public static WebPage page(String pageName) {
        return JDITalk.page(pageName);
    }
}
