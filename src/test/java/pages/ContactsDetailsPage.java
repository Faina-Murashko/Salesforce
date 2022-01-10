package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsDetailsPage extends BasePage{
    public static final By DETAILS_LINK = By.xpath("//div[@class='viewport']/section//div[@role='main']/div[@class='contentArea fullheight']/div/div/div//one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-contact_-record_-page___-contact___-v-i-e-w[@class='adg-rollup-wrapped']/forcegenerated-flexipage_contact_record_page_contact__view_js[@class='forcegenerated-flexipage-module']/record_flexipage-record-page-decorator//records-record-layout-event-broker//flexipage-record-home-template-desktop2[@class='forcegenerated-flexipage-template']//slot[@name='header']//flexipage-component2//records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_contact___012000000000000aaa___compact___view___recordlayout2[@class='forcegenerated-record-layout2']/force-highlights2//div[@role='list']/slot[@name='secondaryFields']/slot/force-highlights-details-item[2]//p[@title='Account Name']");
 //   String fieldValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lighting-formatted-text";

    public ContactsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }




}
