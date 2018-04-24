/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kythe;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/kythe-indexer/testData/indexer")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KytheIndexTestGenerated extends AbstractKytheIndexTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInIndexer() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/kythe-indexer/testData/indexer"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("plugins/kythe-indexer/testData/indexer/anchors")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Anchors extends AbstractKytheIndexTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInAnchors() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/kythe-indexer/testData/indexer/anchors"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("plugins/kythe-indexer/testData/indexer/anchors/declarations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Declarations extends AbstractKytheIndexTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            @TestMetadata("abstractClass.kt")
            public void testAbstractClass() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/declarations/abstractClass.kt");
            }

            public void testAllFilesPresentInDeclarations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/kythe-indexer/testData/indexer/anchors/declarations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("classDeclaration.kt")
            public void testClassDeclaration() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/declarations/classDeclaration.kt");
            }

            @TestMetadata("localPropertyDeclaration.kt")
            public void testLocalPropertyDeclaration() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/declarations/localPropertyDeclaration.kt");
            }

            @TestMetadata("methodDeclaration.kt")
            public void testMethodDeclaration() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/declarations/methodDeclaration.kt");
            }

            @TestMetadata("parameters.kt")
            public void testParameters() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/declarations/parameters.kt");
            }

            @TestMetadata("propertyDeclaration.kt")
            public void testPropertyDeclaration() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/declarations/propertyDeclaration.kt");
            }

            @TestMetadata("singletons.kt")
            public void testSingletons() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/declarations/singletons.kt");
            }
        }

        @TestMetadata("plugins/kythe-indexer/testData/indexer/anchors/implicitConstructions")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class ImplicitConstructions extends AbstractKytheIndexTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInImplicitConstructions() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/kythe-indexer/testData/indexer/anchors/implicitConstructions"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("implicitAccessors.kt")
            public void testImplicitAccessors() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/implicitConstructions/implicitAccessors.kt");
            }

            @TestMetadata("implicitConstructor.kt")
            public void testImplicitConstructor() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/implicitConstructions/implicitConstructor.kt");
            }

            @TestMetadata("implicitProperty.kt")
            public void testImplicitProperty() throws Exception {
                runTest("plugins/kythe-indexer/testData/indexer/anchors/implicitConstructions/implicitProperty.kt");
            }
        }
    }

    @TestMetadata("plugins/kythe-indexer/testData/indexer/declarations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Declarations extends AbstractKytheIndexTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInDeclarations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/kythe-indexer/testData/indexer/declarations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("genericClass.kt")
        public void testGenericClass() throws Exception {
            runTest("plugins/kythe-indexer/testData/indexer/declarations/genericClass.kt");
        }

        @TestMetadata("methods.kt")
        public void testMethods() throws Exception {
            runTest("plugins/kythe-indexer/testData/indexer/declarations/methods.kt");
        }
    }

    @TestMetadata("plugins/kythe-indexer/testData/indexer/multifile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Multifile extends AbstractKytheIndexTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMultifile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/kythe-indexer/testData/indexer/multifile"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("kotlinAgainstKotlin.kt")
        public void testKotlinAgainstKotlin() throws Exception {
            runTest("plugins/kythe-indexer/testData/indexer/multifile/kotlinAgainstKotlin.kt");
        }
    }
}
