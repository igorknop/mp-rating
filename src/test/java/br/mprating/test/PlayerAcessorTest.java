/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mprating.test;

import br.mprating.test.steps.PlayerAcessorStep;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import java.util.ArrayList;
import java.util.List;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

/**
 *
 * @author igor
 */
@RunWith(JUnitReportingRunner.class)
//@RunWith(AnnotatedEmbedderRunner.class)
public class PlayerAcessorTest extends JUnitStories {

    private Configuration configuration;

    public PlayerAcessorTest() {
        super();
        configuration = new Configuration() {
        };
        // configuration.doDryRun(false); "no dry run" is implicit by using
        // default StoryControls

        // configuration.useDefaultStoryReporter(new ConsoleOutput());
        // deprecated -- rather use StoryReportBuilder

        /*
         configuration.useFailureStrategy(new RethrowingFailure());
         configuration.useKeywords(new LocalizedKeywords(new Locale("pt")));
         configuration.usePathCalculator(new AbsolutePathCalculator());
         configuration.useParameterControls(new ParameterControls());
         configuration.useParameterConverters(new ParameterConverters());
         configuration.useParanamer(new NullParanamer());
         configuration.usePendingStepStrategy(new PassingUponPendingStep());
         configuration.useStepCollector(new MarkUnmatchedStepsAsPending());
         configuration.useStepdocReporter(new PrintStreamStepdocReporter());
         configuration.useStepFinder(new StepFinder());
         configuration.useStepMonitor(new SilentStepMonitor());
         configuration
         .useStepPatternParser(new RegexPrefixCapturingPatternParser());
         configuration.useStoryControls(new StoryControls());
         configuration.useStoryLoader(new LoadFromClasspath());
         configuration.useStoryParser(new RegexStoryParser(configuration
         .keywords()));
         configuration.useStoryPathResolver(new UnderscoredCamelCaseResolver());
         configuration.useStoryReporterBuilder(new StoryReporterBuilder());
         configuration.useViewGenerator(new FreemarkerViewGenerator());

         EmbedderControls embedderControls = configuredEmbedder()
         .embedderControls();
         embedderControls.doBatch(false);
         embedderControls.doGenerateViewAfterStories(true);
         embedderControls.doIgnoreFailureInStories(false);
         embedderControls.doIgnoreFailureInView(false);
         embedderControls.doSkip(false);
         embedderControls.doVerboseFailures(false);
         embedderControls.doVerboseFiltering(false);
         embedderControls.useStoryTimeoutInSecs(300);
         embedderControls.useThreads(1);
         */
    }

    @Override
    protected List<String> storyPaths() {
        return new ArrayList<String>() {
            {
                add("player.story");
            }
        };
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new PlayerAcessorStep());
    }
}
