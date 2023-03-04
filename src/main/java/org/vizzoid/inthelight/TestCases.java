package org.vizzoid.inthelight;

import org.vizzoid.inthelight.tile.Leyet;
import org.vizzoid.inthelight.tile.Tile;
import org.vizzoid.utils.test.*;

public class TestCases {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(TestCases.class.getName());

    private TestCases() {
    }

    private static final TestCaseManager cases = new TestCaseManager();

    private static final Leyet TEST_LEYET = new Leyet();

    // testcases ->
    public static final TestCase
    LEYET_WATCH_CLOSE = equals(() -> {
            Player player = new Player();
            return TEST_LEYET.onWalk(player, 0, 0);
        }, Tile.empty()),
    LEYET_WATCH_FAR = equals(() -> {
            Player player = new Player();
            return TEST_LEYET.onWalk(player, 5, 5);
        }, TEST_LEYET);
    // testcases end

    public static void test() {
        cases.thread(r -> LOGGER.log(r.log()));
    }

    private static <T extends TestCase> T add(T t) {
        return cases.add(t);
    }

    private static TestCase create(Tester function) {
        return add(TestCase.create(function));
    }

    private static EqualsTestCase equals(TestSupplier<?> actual, Object predicted) {
        return add(TestCase.equals(actual, predicted));
    }

    private static NotEqualsTestCase notEquals(TestSupplier<?> actual, Object predicted) {
        return add(TestCase.notEquals(actual, predicted));
    }

    private static <T> PredicateTestCase<T> predicate(TestSupplier<T> supplier, TestPredicate<T> predicate) {
        return add(TestCase.predicate(supplier, predicate));
    }

    private static <T> PredicateResultCase<T> predicate(TestSupplier<T> supplier, PredicateTester<T> result) {
        return add(TestCase.predicate(supplier, result));
    }

    private static BooleanTestCase bool(TestSupplier<Boolean> supplier) {
        return add(TestCase.bool(supplier));
    }
}
