package io.quarkus.sample.superheroes.statistics.endpoint;

/**
 * Tests for the {@link TopWinnerWebSocket} class.
 * <p>
 *   These tests mock the {@link TopWinnerStatsChannelHolder#getWinners()} method to return pre-defined input and then set up a sample WebSocket client to listen to messages sent by the server. Each message received is placed into a {@link java.util.concurrent.BlockingQueue} so that message content can be asserted once the expected number of messages have been received.
 * </p>
 */
//@QuarkusTest
class TopWinnerWebSocketTests {
//	@TestHTTPResource("/stats/winners")
//	URI uri;
//
//	@InjectMock
//	TopWinnerStatsChannelHolder topWinnerStatsChannelHolder;
//
//	@Inject
//	ObjectMapper objectMapper;
//
//	@Test
//	public void topWinnerWebSocketTestScenario() throws DeploymentException, IOException, InterruptedException {
//		// Set up the Queue to handle the messages
//		var messages = new LinkedBlockingQueue<String>();
//
//		// Set up a single consumer latch
//		// It will wait for the client to connect and subscribe to the stream before emitting items
//		var latch = new CountDownLatch(1);
//		var delayedUni = Uni.createFrom().voidItem().onItem().delayIt()
//			.until(x -> {
//				try {
//					latch.await();
//					return Uni.createFrom().nullItem();
//				}
//				catch (InterruptedException ex) {
//					return Uni.createFrom().failure(ex);
//				}
//			});
//
//		// Delay the emission of the Multi until the client subscribes
//		var delayedItemsMulti = Multi.createFrom().items(TopWinnerWebSocketTests::createItems)
//			.onItem().call(scores -> Uni.createFrom().nullItem().onItem().delayIt().until(o -> delayedUni));
//
//		// Mock TopWinnerStatsChannelHolder.getWinners() to return the delayed Multi
//		when(this.topWinnerStatsChannelHolder.getWinners()).thenReturn(delayedItemsMulti);
//
//		// Set up the client to connect to the socket
//		try (var session = ContainerProvider.getWebSocketContainer().connectToServer(new EndpointTestClient(messages), this.uri)) {
//			// Make sure client connected
//			assertThat(messages.poll(5, TimeUnit.MINUTES))
//				.isNotNull()
//				.isEqualTo("CONNECT");
//
//			// Client has connected - trigger the Multi subscription
//			latch.countDown();
//
//			var expectedItems = createItems().collect(Collectors.toList());
//
//			// Wait for our messages to appear in the queue
//			await()
//				.atMost(Duration.ofMinutes(5))
//				.until(() -> messages.size() == expectedItems.size());
//
//			System.out.println("Messages received by test: " + messages);
//
//			// Perform assertions that all expected messages were received
//			expectedItems.stream()
//				.map(Unchecked.function(this.objectMapper::writeValueAsString))
//				.forEach(expectedMsg ->
//					assertThat(messages.poll())
//						.isNotNull()
//						.isEqualTo(expectedMsg)
//				);
//		}
//	}
//
//	private static Stream<Iterable<Score>> createItems() {
//		return Stream.of(
//			List.of(new Score("Chewbacca", 5)),
//			List.of(new Score("Darth Vader", 2)),
//			List.of(new Score("Han Solo", 1)),
//			List.of(new Score("Palpatine", 3))
//		);
//	}
//
//	@ClientEndpoint
//	private class EndpointTestClient {
//		private final Logger logger = Logger.getLogger(EndpointTestClient.class);
//		private final BlockingQueue<String> messages;
//
//		private EndpointTestClient(BlockingQueue<String> messages) {
//			this.messages = messages;
//		}
//
//		@OnOpen
//		public void open() {
//			this.logger.info("Opening socket");
//			this.messages.offer("CONNECT");
//		}
//
//		@OnMessage
//		public void message(String msg) {
//			this.logger.infof("Got message: %s", msg);
//			this.messages.offer(msg);
//		}
//
//		@OnClose
//		public void close(CloseReason closeReason) {
//			this.logger.infof("Closing socket: %s", closeReason);
//		}
//
//		@OnError
//		public void error(Throwable error) {
//			this.logger.errorf(error, "Socket encountered error");
//		}
//	}
}
