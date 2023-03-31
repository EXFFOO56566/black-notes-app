.class public final Lcom/google/android/gms/internal/ads/iq1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field private static final c:Lcom/google/android/gms/internal/ads/nv1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/mq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mq1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/mq1;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/iq1;->a:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/wq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/wq1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wq1;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/iq1;->b:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/rq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/rq1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rq1;->a()Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/cr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/cr1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cr1;->a()Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/hr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/hr1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/hr1;->a()Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/xq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/xq1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xq1;->a()Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/ir1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ir1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ir1;->a()Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/nv1;->q()Lcom/google/android/gms/internal/ads/nv1;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/iq1;->c:Lcom/google/android/gms/internal/ads/nv1;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/iq1;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/fs1;->a()V

    new-instance v0, Lcom/google/android/gms/internal/ads/mq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mq1;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/rq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/rq1;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/wq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/wq1;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/xq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/xq1;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/cr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/cr1;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/hr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/hr1;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/ir1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ir1;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/lq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lq1;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/aq1;)V

    return-void
.end method
