.class public final Lcom/google/android/gms/internal/ads/qr1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/nv1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/or1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/or1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/or1;->a()Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/nr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/nr1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nr1;->a()Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/nv1;->q()Lcom/google/android/gms/internal/ads/nv1;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/qr1;->a:Lcom/google/android/gms/internal/ads/nv1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/nv1;->q()Lcom/google/android/gms/internal/ads/nv1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/nv1;->q()Lcom/google/android/gms/internal/ads/nv1;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/iq1;->a()V

    new-instance v0, Lcom/google/android/gms/internal/ads/nr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/nr1;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/or1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/or1;-><init>()V

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/cq1;Lcom/google/android/gms/internal/ads/qp1;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/sr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sr1;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/aq1;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/tr1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/tr1;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/aq1;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
