package br.com.joinfacestest.web.config;

import org.ocpsoft.rewrite.annotation.RewriteConfiguration;
import org.ocpsoft.rewrite.config.Configuration;
import org.ocpsoft.rewrite.config.ConfigurationBuilder;
import org.ocpsoft.rewrite.config.Direction;
import org.ocpsoft.rewrite.servlet.config.Forward;
import org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider;
import org.ocpsoft.rewrite.servlet.config.Path;

import jakarta.servlet.ServletContext;

@RewriteConfiguration
public class RewriteConfig extends HttpConfigurationProvider {
    @Override
    public int priority() {
        return 10;
    }

    @Override
    public Configuration getConfiguration(final ServletContext context) {
        return ConfigurationBuilder.begin()
                .addRule()
                .when(Direction.isInbound().and(Path.matches("/cadastro")))
                .perform(Forward.to("/cadastro.xhtml"))
                .addRule()
                .when(Direction.isInbound().and(Path.matches("/cliente")))
                .perform(Forward.to("/cliente.xhtml"));
    }
}