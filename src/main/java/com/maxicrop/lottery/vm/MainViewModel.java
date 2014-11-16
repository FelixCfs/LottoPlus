/**
 * 
 */
package com.maxicrop.lottery.vm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.lang.Library;
import org.zkoss.spring.SpringUtil;
import org.zkoss.util.Locales;
import org.zkoss.web.Attributes;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Window;

import com.maxicrop.lottery.model.User;
import com.maxicrop.spring.AppConfig;
import com.maxicrop.spring.beans.UserService;

/**
 * @author Apichai.T
 * 
 */
public class MainViewModel {

	private Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@AfterCompose
	public void afterInit() throws Exception {

		System.gc();
	}

	@GlobalCommand
	public void changeLocale(@BindingParam("lang") String lang) {
		try {
			logger.info("Change Locale to " + lang);
			Locale locale = Locales.getLocale(lang);
			Library.setProperty(Attributes.PREFERRED_LOCALE,
					locale.getLanguage());
			Clients.reloadMessages(locale);
			Locales.setThreadLocal(locale);
			Executions.sendRedirect(null);
		} catch (IOException e) {
			logger.info(e.getMessage());
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}

	@Command
	public void addNumberWindow() {

		Map<String, String> arg = new HashMap<String, String>();
		arg.put("someName", "Test");
		Window window = (Window) Executions.createComponents(
				"/layout/add/add_lotto.zul", null, arg);
		window.doModal();
	}
}
