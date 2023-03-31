.class public final Lcom/google/android/gms/internal/ads/fs1;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/nv1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/bs1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bs1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bs1;->a()Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/nv1;->q()Lcom/google/android/gms/internal/ads/nv1;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/fs1;->a:Lcom/google/android/gms/internal/ads/nv1;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/fs1;->a()V
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

    new-instance v0, Lcom/google/android/gms/internal/ads/bs1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bs1;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/as1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/as1;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/js1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/js1;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/aq1;)V

    return-void
.end method
