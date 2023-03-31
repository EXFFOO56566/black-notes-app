.class public final Lcom/google/android/gms/internal/ads/dq0;
.super Lcom/google/android/gms/internal/ads/bq0;
.source ""


# static fields
.field private static final g:Ljava/util/regex/Pattern;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/jp0;

.field private final c:Lcom/google/android/gms/internal/ads/ko1;

.field private final d:Lcom/google/android/gms/internal/ads/zd1;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lcom/google/android/gms/internal/ads/us0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Received error HTTP response code: (.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/dq0;->g:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ads/h80;Lcom/google/android/gms/internal/ads/zd1;Lcom/google/android/gms/internal/ads/jp0;Lcom/google/android/gms/internal/ads/ko1;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/us0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bq0;-><init>(Lcom/google/android/gms/internal/ads/h80;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dq0;->d:Lcom/google/android/gms/internal/ads/zd1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/dq0;->b:Lcom/google/android/gms/internal/ads/jp0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/dq0;->c:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/dq0;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/dq0;->f:Lcom/google/android/gms/internal/ads/us0;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/dq0;)Lcom/google/android/gms/internal/ads/us0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/dq0;->f:Lcom/google/android/gms/internal/ads/us0;

    return-object p0
.end method

.method static synthetic a()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/dq0;->g:Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/vd1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq0;->b:Lcom/google/android/gms/internal/ads/jp0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/jp0;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/gq0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/gq0;-><init>(Lcom/google/android/gms/internal/ads/dq0;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dq0;->c:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->v2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->w2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/dq0;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    const-class v0, Ljava/util/concurrent/TimeoutException;

    sget-object v1, Lcom/google/android/gms/internal/ads/fq0;->a:Lcom/google/android/gms/internal/ads/ln1;

    sget-object v2, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/iq0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/iq0;-><init>(Lcom/google/android/gms/internal/ads/dq0;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method final synthetic a(Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/vd1;

    new-instance v1, Lcom/google/android/gms/internal/ads/pd1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dq0;->d:Lcom/google/android/gms/internal/ads/zd1;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/pd1;-><init>(Lcom/google/android/gms/internal/ads/zd1;)V

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/sd1;->a(Ljava/io/Reader;)Lcom/google/android/gms/internal/ads/sd1;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/vd1;-><init>(Lcom/google/android/gms/internal/ads/pd1;Lcom/google/android/gms/internal/ads/sd1;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
