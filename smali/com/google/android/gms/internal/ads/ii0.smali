.class final synthetic Lcom/google/android/gms/internal/ads/ii0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/gi0;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gi0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ii0;->a:Lcom/google/android/gms/internal/ads/gi0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ii0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ii0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ii0;->a:Lcom/google/android/gms/internal/ads/gi0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ii0;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ii0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/gi0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
