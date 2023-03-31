.class final synthetic Lcom/google/android/gms/internal/ads/yo0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/uo0;

.field private final c:Ljava/lang/Object;

.field private final d:Lcom/google/android/gms/internal/ads/ro;

.field private final e:Ljava/lang/String;

.field private final f:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/uo0;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ro;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yo0;->b:Lcom/google/android/gms/internal/ads/uo0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yo0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/yo0;->d:Lcom/google/android/gms/internal/ads/ro;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/yo0;->e:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/yo0;->f:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yo0;->b:Lcom/google/android/gms/internal/ads/uo0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yo0;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yo0;->d:Lcom/google/android/gms/internal/ads/ro;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/yo0;->e:Ljava/lang/String;

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/yo0;->f:J

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/uo0;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ro;Ljava/lang/String;J)V

    return-void
.end method
