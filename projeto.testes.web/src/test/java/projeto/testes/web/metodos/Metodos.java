package projeto.testes.web.metodos;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos extends Browsers {

	

	
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("-------  error ao escrever no elemento  -------" + e.getMessage());
		}

	}

	
	public void clicar(By elemento, String descricaoPasso) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("-------  error ao abrir clicar no elemento  -------" + e.getMessage());
		}
	}

	
	public void fechar() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("-------  error ao fechar todas as abas  -------" + e.getMessage());
		}

	}

	
	public void getUrl() {
		try {
			String url = driver.getCurrentUrl();
			System.out.println("A url captura é" + url);
		} catch (Exception e) {
			System.out.println("-------  error ao capturar url atual  -------" + e.getMessage());
		}

	}
	
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println("----- error na pausa com thread.sleep -----" + e.getMessage());
		}
	}

	public void clicarPorTexto(String texto,String tag, String descricaoPasso) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//"+tag+"[text()=\""+texto+"\"]")).click();;
		} catch (Exception e) {
			System.err.println("-------  error ao clicar no elemento com o texto  -------" + texto + " ------ " + e.getMessage());
		}

	}

	public void aguardarClick(By elemento) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			System.err.println("-------  error ao aguardar elemento clicavel  ------ " + e.getMessage());
		}

	}
	
	public void screenShot(String nome) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.out.println("----- error no screenShot -----" + e.getMessage());
		}

	}
	
	public void aguardarElemento(By elemento) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		} catch (Exception e) {
			System.out.println("----- error elemento n�o vis�vel -----" + e.getMessage());
		}

	}


}
