.class final synthetic Lcom/google/android/gms/internal/ads/wr0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/mr0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ne1;->a(Ljava/io/InputStream;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
